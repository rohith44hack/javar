package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the position (n) of Fibonacci number: ");
        int n = input.nextInt();

        int fibValue = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibValue);
    }
}

