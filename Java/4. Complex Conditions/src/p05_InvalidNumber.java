import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        if (x >= 100 && x <= 200 || x == 0) {
            return;
        } else {
            System.out.println("invalid");
        }
    }
}
