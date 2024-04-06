package com.icici.lomber.health.insurance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeAnalyzer {

    public static void main(String[] args) {
        // Assuming the file is named 'employee_schedule.csv', adjust as needed
        String filePath = "Assignment_Timecard.xlsx";

        try {
            List<EmployeeRecord> employeeRecords = readEmployeeData(filePath);

            // Analyzing and printing results to console
            analyzeAndPrintResults(employeeRecords);

            // Writing results to output.txt
            writeResultsToFile(employeeRecords);

            // Creating a public Git repository and pushing the codebase
            // Note: You need to initialize a Git repository locally and set up a remote repository on Git hosting service (e.g., GitHub).

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static List<EmployeeRecord> readEmployeeData(String filePath) throws IOException, ParseException {
        List<EmployeeRecord> employeeRecords = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    String name = fields[0].trim();
                    String position = fields[1].trim();
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(fields[2].trim());
                    Date startTime = new SimpleDateFormat("HH:mm").parse(fields[3].trim());
                    Date endTime = new SimpleDateFormat("HH:mm").parse(fields[4].trim());

                    employeeRecords.add(new EmployeeRecord(name, position, date, startTime, endTime));
                }
            }
        }
        return employeeRecords;
    }

    private static void analyzeAndPrintResults(List<EmployeeRecord> employeeRecords) {
        // Sorting employee records based on name and date
        Collections.sort(employeeRecords);

        // Analyzing and printing results to console
        for (int i = 0; i < employeeRecords.size(); i++) {
            EmployeeRecord currentEmployee = employeeRecords.get(i);

            // a) Check for 7 consecutive days
            if (hasConsecutiveDays(employeeRecords, i, currentEmployee, 7)) {
                System.out.println("Name: " + currentEmployee.getName() + ", Position: " + currentEmployee.getPosition()
                        + " has worked for 7 consecutive days.");
            }

            // b) Check for less than 10 hours between shifts
            // Note: The condition considers shifts on different days
            if (i < employeeRecords.size() - 1) {
                EmployeeRecord nextEmployee = employeeRecords.get(i + 1);
                long hoursBetweenShifts = calculateHoursBetweenShifts(currentEmployee.getEndTime(), nextEmployee.getStartTime());

                if (1 < hoursBetweenShifts && hoursBetweenShifts < 10) {
                    System.out.println("Name: " + currentEmployee.getName() + ", Position: " + currentEmployee.getPosition()
                            + " has less than 10 hours between shifts.");
                }
            }

            // c) Check for more than 14 hours in a single shift
            long shiftDuration = calculateHoursBetweenShifts(currentEmployee.getStartTime(), currentEmployee.getEndTime());
            if (shiftDuration > 14) {
                System.out.println("Name: " + currentEmployee.getName() + ", Position: " + currentEmployee.getPosition()
                        + " has worked for more than 14 hours in a single shift.");
            }
        }
    }

    private static boolean hasConsecutiveDays(List<EmployeeRecord> employeeRecords, int currentIndex, EmployeeRecord currentEmployee, int consecutiveDays) {
        for (int i = currentIndex + 1; i < employeeRecords.size(); i++) {
            EmployeeRecord nextEmployee = employeeRecords.get(i);
            long daysBetween = calculateDaysBetween(currentEmployee.getDate(), nextEmployee.getDate());

            if (currentEmployee.getName().equals(nextEmployee.getName()) && daysBetween == 1) {
                consecutiveDays--;
                if (consecutiveDays == 0) {
                    return true;
                }
            } else {
                break;
            }
        }
        return false;
    }

    private static long calculateDaysBetween(Date startDate, Date endDate) {
        long difference = endDate.getTime() - startDate.getTime();
        return difference / (24 * 60 * 60 * 1000); // Convert milliseconds to days
    }

    private static long calculateHoursBetweenShifts(Date startTime, Date endTime) {
        long difference = endTime.getTime() - startTime.getTime();
        return difference / (60 * 60 * 1000); // Convert milliseconds to hours
    }

    private static void writeResultsToFile(List<EmployeeRecord> employeeRecords) throws IOException {
        try (FileWriter writer = new FileWriter("output.txt")) {
            for (EmployeeRecord employeeRecord : employeeRecords) {
                writer.write("Name: " + employeeRecord.getName() + ", Position: " + employeeRecord.getPosition() + "\n");
            }
        }
    }
}

class EmployeeRecord implements Comparable<EmployeeRecord> {
    private String name;
    private String position;
    private Date date;
    private Date startTime;
    private Date endTime;

    public EmployeeRecord(String name, String position, Date date, Date startTime, Date endTime) {
        this.name = name;
        this.position = position;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Date getDate() {
        return date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(EmployeeRecord other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return this.date.compareTo(other.date);
        }
    }
}
