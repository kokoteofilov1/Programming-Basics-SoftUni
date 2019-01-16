import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double amount = Double.parseDouble(console.nextLine());
        String convertFrom = console.nextLine();
        String convertTo = console.nextLine();

        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;

        switch (convertFrom) {
            case "BGN":
                break;
            case "USD":
                amount = amount * usd;
                break;
            case "EUR":
                amount = amount * eur;
                break;
            case "GBP":
                amount = amount * gbp;
                break;
        }

        switch (convertTo) {
            case "BGN":
                amount = amount / bgn;
                break;
            case "USD":
                amount = amount / usd;
                break;
            case "EUR":
                amount = amount / eur;
                break;
            case "GBP":
                amount = amount / gbp;
                break;
        }

        System.out.printf("%.2f %s", amount, convertTo);
    }
}
