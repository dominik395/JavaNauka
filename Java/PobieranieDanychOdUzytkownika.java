package Java;
import java.util.Scanner;

public class PobieranieDanychOdUzytkownika {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your surname?");
        String surname = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt(); 

        System.out.println("Name: " + name + "\nSunrname: " + surname + "\nAge: " + age);
        
        scanner.close();
    }
}
