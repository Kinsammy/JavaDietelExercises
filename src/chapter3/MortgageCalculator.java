import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual interest Rate: ");
        float rate = input.nextFloat();
        float monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = input.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted );


    }
}
