import java.util.Scanner;

public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine().toLowerCase();
        String city = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());

        double price = 0;

        if (city.equals("sofia")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.50;
                    break;
                case "water":
                    price = quantity * 0.80;
                    break;
                case "beer":
                    price = quantity * 1.20;
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    break;
            }
        } else if (city.equals("plovdiv")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.40;
                    break;
                case "water":
                    price = quantity * 0.70;
                    break;
                case "beer":
                    price = quantity * 1.15;
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    break;
            }
        } else if (city.equals("varna")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.45;
                    break;
                case "water":
                    price = quantity * 0.70;
                    break;
                case "beer":
                    price = quantity * 1.10;
                    break;
                case "sweets":
                    price = quantity * 1.35;
                    break;
                case "peanuts":
                    price = quantity * 1.55;
                    break;
            }
        }

        System.out.println(price);
    }
}
