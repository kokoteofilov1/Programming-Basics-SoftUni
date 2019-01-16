import java.util.Scanner;

public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();

        if (sex.charAt(0) == 'm') {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
