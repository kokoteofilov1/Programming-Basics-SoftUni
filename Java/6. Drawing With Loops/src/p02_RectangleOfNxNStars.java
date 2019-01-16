import java.util.Scanner;

public class p02_RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        for (int rows = 0; rows < x; rows++) {
            for (int cols = 0; cols < x; cols++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
