import java.util.Scanner;

public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        boolean areEqual = true;
        for (int i = 0; i < x; i++) {
            int first = Integer.parseInt(console.nextLine());
            int second = Integer.parseInt(console.nextLine());
            int tempSum = first + second;

            if (i == 0) {
                sum = first + second;

                if (sum < minSum) {
                    minSum = sum;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            } else {
                if (tempSum < minSum) {
                    minSum = tempSum;
                } else if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }

            if (tempSum != sum) {
                areEqual = false;
            }
        }

        int maxDifference = Math.abs(minSum - maxSum);

        if (areEqual) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
