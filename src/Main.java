import java.util.Scanner;

public class Main {
    public static boolean isProbableTopper(int number) {
        int oddSum = 0;
        int evenSum = 0;


        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return oddSum == evenSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean result = isProbableTopper(number);
        System.out.println(result);

        scanner.close();
    }
}