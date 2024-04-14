package Java;

import java.util.Scanner;

public class TypyDanychIOperatory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter first number");
        a = scanner.nextInt();

        System.out.println("Enter secong number");
        b = scanner.nextInt();

        scanner.close();
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        
        System.out.println("Result: ");
        System.out.println("Add: " + (a + b));
        System.out.println("Subtracion: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

    }
}
