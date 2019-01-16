import java.util.Scanner;

public class p04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        for (int rows = 1; rows <= x; rows++) {
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
