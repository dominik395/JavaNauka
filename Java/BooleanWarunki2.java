package Java;

import java.util.Scanner;

public class BooleanWarunki2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int number3 = scanner.nextInt();
        scanner.close();

        if (number1 == number2 && number1 > number3) {
            System.out.println("First and second number is the biggest");
        } else if (number1 == number3 && number1 > number2) {
            System.out.println("First and third number is the biggest");
        } else if (number2 == number3 && number2 > number1) {
            System.out.println("Second and third number is the biggest");
        } else if (number1 > number2 && number1 > number3) {
            System.out.println("First number is the biggest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Second number is the biggest");
        } else if (number3 > number1 && number3 > number1) {
            System.out.println("Third number is the biggest");
        }
    }
}
