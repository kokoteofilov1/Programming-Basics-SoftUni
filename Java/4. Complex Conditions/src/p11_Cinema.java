import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String ticketType = console.nextLine().toLowerCase();
        int rows = Integer.parseInt(console.nextLine());
        int cols = Integer.parseInt(console.nextLine());

        double price = 0;
        switch (ticketType) {
            case "premiere":
                price = 12;
                break;
            case "normal":
                price = 7.50;
                break;
            case "discount":
                price = 5;
        }

        System.out.printf("%.2f leva", rows * cols * price);
    }
}
