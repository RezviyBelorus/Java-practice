package hw_3;

import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        double numD1 = 1.2;
        double numD2 = 1.4;
        BigDecimal bigD1 = BigDecimal.valueOf(numD1);
        BigDecimal bigD2 = BigDecimal.valueOf(numD2);

        BigDecimal sum = bigD1.add(bigD2);

        System.out.println("Summa double = " + sum);
    }
}
