import java.util.Scanner;

public class p10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //System.out.print("Rad: ");
        double rad = Double.parseDouble(console.nextLine());

        double deg = rad * 180 / Math.PI;

        //System.out.print("Degrees = );
        System.out.print(Math.round(deg));
    }
}
