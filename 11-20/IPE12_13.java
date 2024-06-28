import java.util.Scanner;

public class IPE12_13 {
    // 12 WAP to enter a character and check whether it is a vowel or consonant
    // using switch statement.
    // 13 WAP to check whether entered character is vowel or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // same as capital A E I O U
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        //
        // same as capital A E I O U
        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;

            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;

            default:
                System.out.println("consonant");
                break;

        }
    }
}
