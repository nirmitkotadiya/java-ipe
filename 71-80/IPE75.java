import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class IPE75 {
    public static void main(String[] args) throws IOException {
        // Read employee salary and calculate the income tax based on 10% of income and
        // store it in tax.txt file for five different employees

        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter Salary : ");
            int salary = sc.nextInt();
            sc.nextLine();

            emp[i] = new Employee(name, salary);
        }

        File f = new File("tax.txt");
        f.createNewFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            for (Employee employee : emp) {
                bw.write("Name : " + employee.name + " Salary : " + employee.salary + " Tax : "
                        + (employee.salary * 0.1));
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
