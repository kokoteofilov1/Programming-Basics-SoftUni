import java.util.Scanner;

public class p08_TradeCommissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String city = console.nextLine().toLowerCase();
        Double volume = Double.parseDouble(console.nextLine());

        double commission;
        if (volume < 0) {
            System.out.println("error");
            return;
        } else if (volume >= 0 && volume <= 500) {
            switch (city) {
                case "sofia":
                    commission = 5;
                    break;
                case "varna":
                    commission = 4.5;
                    break;
                case "plovdiv":
                    commission = 5.5;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else if (volume > 500 && volume <= 1000) {
            switch (city) {
                case "sofia":
                    commission = 7;
                    break;
                case "varna":
                    commission = 7.5;
                    break;
                case "plovdiv":
                    commission = 8;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else if (volume > 1000 && volume <= 10000) {
            switch (city) {
                case "sofia":
                    commission = 8;
                    break;
                case "varna":
                    commission = 10;
                    break;
                case "plovdiv":
                    commission = 12;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else {
            switch (city) {
                case "sofia":
                    commission = 12;
                    break;
                case "varna":
                    commission = 13;
                    break;
                case "plovdiv":
                    commission = 14.5;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        }

        System.out.printf("%.2f", volume * (commission / 100));
    }
}
