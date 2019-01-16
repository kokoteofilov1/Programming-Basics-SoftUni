import java.util.Scanner;

public class p11_OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;

        for (int i = 1; i <= x; i++) {
            double current = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                evenSum += current;

                if (current < evenMin) {
                    evenMin = current;
                }
                if (current > evenMax) {
                    evenMax = current;
                }
            } else {
                oddSum += current;

                if (current < oddMin) {
                    oddMin = current;
                }
                if (current > oddMax) {
                    oddMax = current;
                }
            }
        }

        System.out.printf("OddSum=%.1f,%n", oddSum);
        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%.1f,%n", oddMin);
        }
        if (oddMax == Double.MIN_VALUE) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%.1f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.1f,%n", evenSum);
        if (evenMin == Double.MAX_VALUE) {
            System.out.println("EvenMin=No");
        } else {
            System.out.printf("EvenMin=%.1f,%n", evenMin);
        }
        if (evenMax == Double.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.1f,%n", evenMax);
        }
    }
}
