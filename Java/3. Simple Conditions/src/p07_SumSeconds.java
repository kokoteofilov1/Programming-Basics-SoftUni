import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstSeconds = Integer.parseInt(console.nextLine());
        int secondSeconds = Integer.parseInt(console.nextLine());
        int thirdSeconds = Integer.parseInt(console.nextLine());

        int sumSeconds = firstSeconds + secondSeconds + thirdSeconds;

        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}

