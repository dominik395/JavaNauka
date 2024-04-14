package Java;

public class LiczbyZmiennoPrzecinkowe {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;
        double c = a / b;

        System.out.println(Math.round(c*100.0) / 100.0);
        
        String formatedNumber = String.format("%.2f", c);
        System.out.println(formatedNumber);
    }
}
