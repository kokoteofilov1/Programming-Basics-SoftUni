import java.util.Scanner;

public class p11_USDToBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //System.out.print("USD: ");
        double usd = Double.parseDouble(console.nextLine());

        double bgn = usd * 1.79549;

        System.out.printf("%.2f BGN", bgn);
    }
}
