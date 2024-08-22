package javapractice;

import java.util.Scanner;

class Student {
    String name;
    int age;
    float cgpa;
    String Email;
    
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student CGPA: " + cgpa);
        System.out.println("Student Email: " + Email);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student's name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        student.age = scanner.nextInt();

        System.out.print("Enter student's cgpa: ");
        student.cgpa= scanner.nextFloat();
        scanner.nextLine();  

        System.out.print("Enter student's email: ");
        student.Email = scanner.nextLine();

        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}


