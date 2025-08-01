    package netpaycalculation;

import java.util.Scanner;

public class Employee {
    private double grossSalary;
    private double taxRate;
    private double hra;
    private double da;

    public Employee(double grossSalary, double taxRate, double hra, double da) {
        this.grossSalary = grossSalary;
        this.taxRate = taxRate;
        this.hra = hra;
        this.da = da;
    }

    public double calculateNetPay() {
        double taxAmount = grossSalary * (taxRate / 100);
        return grossSalary + hra + da - taxAmount;
    }

    public void displayEmployeeDetails() {
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("House Rent Allowance (HRA): ₹" + hra);
        System.out.println("Dearness Allowance (DA): ₹" + da);
        System.out.println("Net Pay: ₹" + calculateNetPay());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Gross Salary in Rupees:");
        double grossSalary = scanner.nextDouble();

        System.out.println("Enter Tax Rate (in percentage):");
        double taxRate = scanner.nextDouble();

        System.out.println("Enter House Rent Allowance (HRA) in Rupees:");
        double hra = scanner.nextDouble();

        System.out.println("Enter Dearness Allowance (DA) in Rupees:");
        double da = scanner.nextDouble();

        Employee employee = new Employee(grossSalary, taxRate, hra, da);
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
