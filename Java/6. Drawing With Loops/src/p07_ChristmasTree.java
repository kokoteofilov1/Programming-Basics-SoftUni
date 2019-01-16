import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= x; i++) {
            for (int spaces = 0; spaces < x - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < i; stars++) {
                System.out.print('*');
            }
            System.out.print(" | ");
            for (int stars = 0; stars < i; stars++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
