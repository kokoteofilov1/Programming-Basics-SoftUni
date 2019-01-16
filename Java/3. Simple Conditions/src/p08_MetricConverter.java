import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double value = Double.parseDouble(console.nextLine());
        String convertFrom = console.nextLine();
        String convertTo = console.nextLine();

        // we should convert the entry unit to meters so that we can convert from meters only;

        switch (convertFrom) {
            case "mm":
                value *= 0.001;
                break;
            case "cm":
                value *= 0.01;
                break;
            case "mi":
                value /= 0.000621371192;
                break;
            case "in":
                value *= 0.0254;
                break;
            case "km":
                value *= 1000;
                break;
            case "ft":
                value *= 0.3048;
                break;
            case "yd":
                value *= 0.9144;
                break;
        }

        // now we convert the value in meters to the exit value;

        switch (convertTo) {
            case "mm":
                value *= 1000;
                break;
            case "cm":
                value *= 100;
                break;
            case "mi":
                value *= 0.000621371192;
                break;
            case "in":
                value *= 39.3700787;
                break;
            case "km":
                value *= 0.001;
                break;
            case "ft":
                value *= 3.2808399;
                break;
            case "yd":
                value *= 1.0936133;
                break;
        }

        System.out.printf("%.8f %s", value, convertTo);
    }
}
