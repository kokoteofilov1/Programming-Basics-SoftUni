import java.util.Scanner;

public class p09_PasswordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputPassword = console.nextLine();
        String checkPassword = "s3cr3t!P@ssw0rd";

        if (inputPassword.equals(checkPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
