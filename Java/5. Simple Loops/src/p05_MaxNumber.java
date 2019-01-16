import java.util.Scanner;

public class p05_MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < x; i++) {
            int current = Integer.parseInt(console.nextLine());
            if (current > biggest) {
                biggest = current;
            }
        }

        System.out.println(biggest);
    }
}
