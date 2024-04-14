package Java;

import java.math.BigDecimal;

public class OperacjeFinansowe {
    public static void main(String[] args) {
        double a = 0.2;
        double b = 0.1;

        System.out.println(a + b);

        BigDecimal c = new BigDecimal("0.2");
        BigDecimal d = new BigDecimal("0.1");

        System.out.println(c.add(d));
    }
}
