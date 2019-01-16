import java.util.Scanner;

public class p05_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int result = 1;
        while (result <= n) {
            System.out.println(result);

            result *= 2;
            result += 1;
        }
    }
}
