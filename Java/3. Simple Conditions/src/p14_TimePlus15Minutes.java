import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hour = Integer.parseInt(console.nextLine());

        if (hour > 24) {
            System.out.println("Not a valid hour!");
        }

        int minutes = Integer.parseInt(console.nextLine());

        int totalMinutes = minutes + 15;

        if (totalMinutes > 59) {
            hour++;
            totalMinutes = totalMinutes - 60;
        }

        if (hour > 23) {
            hour = hour - 24;
        }

        if (totalMinutes < 10) {
            System.out.println(hour + ":0" + totalMinutes);
        } else {
            System.out.println(hour + ":" + totalMinutes);
        }
    }
}
