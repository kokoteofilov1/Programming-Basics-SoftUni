import java.util.Scanner;

public class p12_Voleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String typeOfYear = console.nextLine().toLowerCase();
        int holidays = Integer.parseInt(console.nextLine());
        int weekendsAway = Integer.parseInt(console.nextLine());

        int weekendsInSofia = 48 - weekendsAway;

        double gamesInWeekends = weekendsInSofia * 3.0 / 4;
        double gamesInHolidays = holidays * 2.0 / 3;

        double games = gamesInHolidays + gamesInWeekends + weekendsAway;

        if (typeOfYear.equals("leap")) {
            games = games + games * 0.15;
        }

        System.out.printf("%.0f", Math.floor(games));
    }
}
