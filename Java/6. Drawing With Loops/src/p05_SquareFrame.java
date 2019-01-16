import java.util.Scanner;

public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

//first part
        System.out.print("+ ");
        for (int dashes = 1; dashes <= x - 2; dashes++) {
            System.out.print("- ");
        }
        System.out.print("+");
//mid rows
        for (int mid = 1; mid <= x - 2; mid++) {
            System.out.println();
            System.out.print("| ");
            for (int dashes = 1; dashes <= x - 2; dashes++) {
                System.out.print("- ");
            }
            System.out.print("|");
        }
// last row
        System.out.println();
        System.out.print("+ ");
        for (int dashes = 1; dashes <= x - 2; dashes++) {
            System.out.print("- ");
        }
        System.out.print("+");
    }
}


