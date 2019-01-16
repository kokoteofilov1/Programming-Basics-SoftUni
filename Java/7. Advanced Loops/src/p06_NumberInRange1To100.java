import java.util.Scanner;

public class p06_NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        while (num < 1 || num > 100) {
            System.out.print("Invalid number!\nEnter a number in the range [1...100]: ");
            num = Integer.parseInt(console.nextLine());
        }

        System.out.println("The number is: " + num);
    }
}
