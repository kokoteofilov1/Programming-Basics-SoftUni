import java.util.Scanner;

public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < x; i++) {
            int current = Integer.parseInt(console.nextLine());
            if (current < smallest) {
                smallest = current;
            }
        }

        System.out.println(smallest);
    }
}
