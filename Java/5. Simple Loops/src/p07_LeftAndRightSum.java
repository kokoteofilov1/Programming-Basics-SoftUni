import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        for (int i = 0; i < x; i++) {
            leftSum += Integer.parseInt(console.nextLine());
        }

        int rightSum = 0;
        for (int i = 0; i < x; i++) {
            rightSum += Integer.parseInt(console.nextLine());
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
