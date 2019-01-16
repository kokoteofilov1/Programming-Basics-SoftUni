import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        //first row
        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
        //end of first row

        System.out.println();

        //mid rows
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
        //end of mid rows

        //last row
        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
        //end of last row
    }
}
