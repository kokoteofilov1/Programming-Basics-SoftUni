import java.util.Scanner;

public class p16_Number0To100InText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        if (num < 0 || num > 100) {
            System.out.println("invalid number");
            return;
        }

        if (num > 9 && num < 20 || num == 100 || num == 0) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 100:
                    System.out.println("one hundred");
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            return;
        }

        int temp = num;
        int counter = 0;
        int[] digits = new int[2];
        while (temp != 0) {
            digits[counter] = temp % 10;
            temp /= 10;

            counter++;
        }

        String secondDigit;
        String firstDigit;

        switch (digits[0]) {
            case 0:
                secondDigit = "0";
                break;
            case 1:
                secondDigit = "one";
                break;
            case 2:
                secondDigit = "two";
                break;
            case 3:
                secondDigit = "three";
                break;
            case 4:
                secondDigit = "four";
                break;
            case 5:
                secondDigit = "five";
                break;
            case 6:
                secondDigit = "six";
                break;
            case 7:
                secondDigit = "seven";
                break;
            case 8:
                secondDigit = "eight";
                break;
            case 9:
                secondDigit = "nine";
                break;
            default:
                secondDigit = "";
                break;
        }

        switch (digits[1]) {
            case 2:
                firstDigit = "twenty";
                break;
            case 3:
                firstDigit = "thirty";
                break;
            case 4:
                firstDigit = "forty";
                break;
            case 5:
                firstDigit = "fifty";
                break;
            case 6:
                firstDigit = "sixty";
                break;
            case 7:
                firstDigit = "seventy";
                break;
            case 8:
                firstDigit = "eighty";
                break;
            case 9:
                firstDigit = "ninety";
                break;
            default:
                firstDigit = "";
                break;
        }

        if (secondDigit.equals("0")) {
            System.out.println(firstDigit);
        } else if (digits[1] == 0) {
            System.out.println(secondDigit);
        } else {
            System.out.printf("%s %s", firstDigit, secondDigit);
        }
    }
}