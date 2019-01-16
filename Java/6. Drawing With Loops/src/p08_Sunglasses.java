import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        //first row
        for (int stars = 0; stars < 2 * x; stars++) {
            System.out.print('*');
        }
        for (int spaces = 0; spaces < x; spaces++) {
            System.out.print(" ");
        }
        for (int stars = 0; stars < 2 * x; stars++) {
            System.out.print('*');
        }
        System.out.println();

        //middle rows
        for (int midRows = 0; midRows < x - 2; midRows++) {
            //left side of row
            System.out.print('*');
            for (int slashes = 0; slashes < 2 * x - 2; slashes++) {
                System.out.print('/');
            }
            System.out.print('*');

            //mid rows spaces or slashes
            if (midRows == (x - 1) / 2 - 1) {
                for (int slashes = 0; slashes < x; slashes++) {
                    System.out.print('|');
                }
            } else {
                for (int spaces = 0; spaces < x; spaces++) {
                    System.out.print(" ");
                }
            }

            //right side of row
            System.out.print('*');
            for (int slashes = 0; slashes < 2 * x - 2; slashes++) {
                System.out.print('/');
            }
            System.out.print('*');

            System.out.println();
        }

        //last row
        for (int stars = 0; stars < 2 * x; stars++) {
            System.out.print('*');
        }
        for (int spaces = 0; spaces < x; spaces++) {
            System.out.print(" ");
        }
        for (int stars = 0; stars < 2 * x; stars++) {
            System.out.print('*');
        }
    }
}
