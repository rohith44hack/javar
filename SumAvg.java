package sum.avg;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
