package gradecalc;

import java.util.Scanner;

public class Gradecalc {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = input.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid marks";
        } else if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B+";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("Grade: " + grade);
    }
}
