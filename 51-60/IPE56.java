public class IPE56 {
    public static void main(String[] args) {
        // Write a program which takes five numbers as command line argument from user,
        // store them in one
        // dimensional array and display count of negative numbers.

        int numbers[] = new int[5];
        int negativeNum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            if (numbers[i] < 0) {
                negativeNum++;
            }
        }
        System.out.println("Negative Num : " + negativeNum);
    }

}
