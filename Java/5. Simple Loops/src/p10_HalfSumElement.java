import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int biggest = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            int current = Integer.parseInt(console.nextLine());

            if (current > biggest) {
                biggest = current;
            }

            sum += current;
        }

        if (biggest == sum - biggest) {
            System.out.printf("Yes%nSum = %d", biggest);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(biggest - (sum - biggest)));
        }
    }
}
