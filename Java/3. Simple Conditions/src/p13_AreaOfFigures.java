import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String typeOfFigure = console.nextLine();

        if (typeOfFigure.equals("square")) {
            double a = Double.parseDouble(console.nextLine());
            System.out.println(a * a);
        } else if (typeOfFigure.equals("rectangle")) {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            System.out.println(a * b);
        } else if (typeOfFigure.equals("circle")) {
            double r = Double.parseDouble(console.nextLine());
            System.out.println(r * r * Math.PI);
        } else if (typeOfFigure.equals("triangle")) {
            double a = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());
            System.out.println((a * h) / 2);
        } else {
            System.out.println("This type of figure is not supported.");
        }
    }
}
