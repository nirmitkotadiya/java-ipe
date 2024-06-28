import java.util.Scanner;

abstract class Person {
    String name;
    String address;
    int number;
    String email;

    public Person(String name, String address, int number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    abstract void inputDetails();

    abstract void displayDetails();
}

class Student extends Person {
    String enroll_course;

    public Student(String name, String address, int number, String email, String enroll_course) {
        super(name, address, number, email);
        this.enroll_course = enroll_course;

    }

    @Override
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Name");
        name = sc.nextLine();
        System.out.print("Enter Student's Address: ");
        address = sc.nextLine();

        System.out.print("Enter Student's Phone Number: ");
        number = sc.nextInt();

        System.out.print("Enter Student's Email Address: ");
        email = sc.nextLine();

        System.out.print("Enter Enrollment Course: ");
        enroll_course = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + number);
        System.out.println("Email Address: " + email);
        System.out.println("Enrollment Course: " + enroll_course);
    }
}

class Employee extends Person {
    String office;
    int salary;
    String designation;

    public Employee(String name, String address, int number, String email, String enroll_course, String office,
            int salary, String designation) {
        super(name, address, number, email);
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee's Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Employee's Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Employee's Phone Number: ");
        number = scanner.nextInt();

        System.out.print("Enter Employee's Email Address: ");
        email = scanner.nextLine();

        System.out.print("Enter Office: ");
        office = scanner.nextLine();

        System.out.print("Enter Salary: ");
        salary = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Designation: ");
        designation = scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + number);
        System.out.println("Email Address: " + email);
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

public class IPE79 {
    public static void main(String[] args) {
        // Write a abstract class named Person and its two subclasses named student and
        // Employee. A person has a name, address, phone number and email address. A
        // student has enrollment course. An Employee has an office, salary, and
        // designation. Define constructors and methods for input and display for both
        // classes. Define constructor and methods for input and display for both
        // classes. Write a main program to give demonstration of all.

        Student student = new Student(null, null, 0, null, null);
        System.out.println("Enter details for the Student : ");
        student.inputDetails();
        student.displayDetails();

        Employee employee = new Employee(null, null, 0, null, null, null, 0, null);
        System.out.println("\n Enter detals for the employee");
        employee.inputDetails();
        employee.displayDetails();

    }
}
