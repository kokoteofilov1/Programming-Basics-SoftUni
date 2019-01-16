import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //System.out.print("Celsius: ");
        double celsius = Double.parseDouble(console.nextLine());

        double fahrenheit = celsius * 1.8 + 32;

        //System.out.print("Fahrenheit = ");
        System.out.printf("%.2f", fahrenheit);
    }
}
