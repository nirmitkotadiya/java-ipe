import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    String name;
    int scores;

    public Student(String name, int scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public int getScores() {
        return scores;
    }
}

public class IPE58 {
    public static void main(String[] args) {
        // Write a program that prompts the user to enter the number of students, the
        // students’ names, and their scores,
        // and prints student names in decreasing order of their scores.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int num = sc.nextInt();
        Student[] s = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter Student Name : ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Student Scores ");
            int scores = sc.nextInt();
            sc.nextLine();
            s[i] = new Student(name, scores);
        }

        // sort
        Arrays.sort(s, Comparator.comparingInt(Student::getScores).reversed());

        // print
        for (Student student : s) {
            System.out.println(student.getName() + " " + student.getScores());
        }
        sc.close();
    }

}
