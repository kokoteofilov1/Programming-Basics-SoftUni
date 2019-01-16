import java.util.Scanner;

public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(console.nextLine());
            } else {
                oddSum += Integer.parseInt(console.nextLine());
            }
        }

        if (evenSum == oddSum) {
            System.out.printf("Yes, sum = %d", evenSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
