import java.util.Scanner;

public class p10_CheckPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        if (num < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}
