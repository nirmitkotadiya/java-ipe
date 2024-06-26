import java.util.Scanner;

public class IPE46 {
    public static void main(String[] args) {
        // 46 WAP to reverse the input string.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        System.out.println("String " + str);
        System.out.println("reverse String " + reverseString);
        sc.close();
    }
}
