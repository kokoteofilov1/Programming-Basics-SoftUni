import java.util.Scanner;

public class p04_SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += Integer.parseInt(console.nextLine());
        }

        System.out.println(sum);
    }
}
