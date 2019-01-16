import java.util.Scanner;

public class p13_NumberPyramic {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(num);

                if (num > 1) {
                    System.out.print(" ");
                }

                num++;

                if (num > n) {
                    break;
                }
            }

            System.out.println();

            if (num > n) {
                break;
            }
        }
    }
}
