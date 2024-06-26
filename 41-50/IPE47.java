import java.util.Scanner;

public class IPE47 {
    public static void concateStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            result.append(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            result.append(str2.charAt(i));
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        // 47 WAP to concatenate two strings without using built in function.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        concateStrings(str1, str2);
        sc.close();
    }

}
