import java.util.Scanner;

public class p04_EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println(num);
            num *= 4;
        }
    }
}
