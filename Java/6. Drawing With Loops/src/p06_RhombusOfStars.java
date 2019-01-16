import java.util.Scanner;

public class p06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= x; i++) {
            for (int spaces = 0; spaces < x - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < x - 1; i++) {
            for (int spaces = 0; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars < x - i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
