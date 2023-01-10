package chapter8.BigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        int year = 10;
        calculateInterest(principal, rate, year);
  }
    private static void calculateInterest(BigDecimal principal, BigDecimal rate, int period) {
        BigDecimal amount = BigDecimal.valueOf(0);
        System.out.printf("%s%20s%n", "Year", "Amount  on deposit");
        for (int year = 1; year<= period; year++){
            amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }

    }


}
