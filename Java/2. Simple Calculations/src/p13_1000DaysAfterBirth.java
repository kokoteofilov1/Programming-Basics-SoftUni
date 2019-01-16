import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dateOfBirth = LocalDate.parse(input, formatter);

        LocalDate datePlus1000 = dateOfBirth.plusDays(999);

        System.out.println(formatter.format(datePlus1000));
    }
}
