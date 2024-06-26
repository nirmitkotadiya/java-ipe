import java.util.Scanner;

public class IPE45 {
    public static void main(String[] args) {
        // 45 WAP to check given string is palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        if (reverseString.equals(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not  palindrome");
        }
        sc.close();
    }
}
