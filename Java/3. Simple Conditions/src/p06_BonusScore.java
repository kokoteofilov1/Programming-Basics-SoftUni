import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = Integer.parseInt(console.nextLine());

        double bonusScore = 0;

        if (score <= 100) {
            bonusScore += 5;
        } else if (score > 100 && score <= 1000) {
            bonusScore += score * 20 / 100;
        } else if (score > 1000) {
            bonusScore += score * 10 / 100;
        }

        if (score % 2 == 0) {
            bonusScore += 1;
        } else if (score % 5 == 0) {

            bonusScore += 2;
        }

        double totalScore = score + bonusScore;

        System.out.printf("Bonus score: %f%n", bonusScore);
        System.out.printf("Total score: %f", totalScore);
    }
}
