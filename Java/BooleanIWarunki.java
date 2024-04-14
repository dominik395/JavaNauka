package Java;

import java.util.Scanner;

public class BooleanIWarunki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 90 && number <= 100) {
            System.out.println("Your mark: 5");
        } else if (number >= 80 && number <= 89) {
            System.out.println("Your mark: 4");
        } else if (number >= 70 && number <= 79) {
            System.out.println("Your mark: 3");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Your mark: 2");
        } else if (number >= 0 && number <= 59) {
            System.out.println("Your mark: 1");
        } else {
            System.out.println("Wrong number");
        }

    }
}
