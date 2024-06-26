import java.util.Scanner;

public class IPE48 {
    public static void main(String[] args) {
        // 48 WAP to accept a string and count the number of vowels present in a string.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.nextLine();
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                vowel++;
            }
        }
        System.out.println("vowel count = " + vowel);

        sc.close();
    }

}
