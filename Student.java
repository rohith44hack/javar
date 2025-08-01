package school;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter Age: ");
        int age = scanner.nextInt(); 

        Student student1 = new Student(name, age);
        student1.displayInfo();

        scanner.close(); 
    }
}
