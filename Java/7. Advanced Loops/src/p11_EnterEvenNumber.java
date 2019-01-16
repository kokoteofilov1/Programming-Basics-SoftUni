import java.util.Scanner;

public class p11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        while (true) {
            if (n % 2 == 0) {
                System.out.println("Found even number: " + n);
                break;

            } else {
                System.out.println("The number is not even.");
                n = Integer.parseInt(console.nextLine());
            }
        }
    }
}
