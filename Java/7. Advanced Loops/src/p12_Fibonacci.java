import java.util.Scanner;

public class p12_Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int f0 = 0;
        int f1 = 1;
        int nextF = 0;
        for (int i = 0; i < n; i++) {
            nextF = f0 + f1;
            f0 = f1;
            f1 = nextF;
        }
        if (n < 2) {
            System.out.println(1);
        } else {
            System.out.println(nextF);
        }
    }
}
