package netpaycalculation;

import java.util.Scanner;

public class Employee {
    private String name;
    private double grossSalary;
    private double taxRate;
    private double deductions;

    public Employee(String name, double grossSalary, double taxRate, double deductions) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.taxRate = taxRate;
        this.deductions = deductions;
    }

    public double calculateNetPay() {
        double taxAmount = grossSalary * (taxRate / 100);
        return grossSalary - taxAmount - deductions;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Deductions: ₹" + deductions);
        System.out.println("Net Pay: ₹" + calculateNetPay());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Gross Salary in Rupees:");
        double grossSalary = scanner.nextDouble();

        System.out.println("Enter Tax Rate (in percentage):");
        double taxRate = scanner.nextDouble();

        System.out.println("Enter Deductions in Rupees:");
        double deductions = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, taxRate, deductions);
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
