package chapter4;

public class TaxCalculatorTest {

    public static void main(String[] args) {
        TaxCalculator janessa = new TaxCalculator("Janessa", 30000);
        TaxCalculator fred = new TaxCalculator("Fred", 90000);
        TaxCalculator jake = new TaxCalculator("Jake", 190000);

        janessa.setTaxRate(janessa.getEarnings());
        fred.setTaxRate(fred.getEarnings());
        jake.setTaxRate(jake.getEarnings());

        double totalTaxCharge = janessa.getEarnings() * janessa.getTaxRate();
        double totalTaxCharge2 = fred.getEarnings() * fred.getTaxRate();
        double totalTaxCharge3 = jake.getEarnings() * jake.getTaxRate();


        System.out.printf("%s's tax rate is: %.2f and her total tax charge is: %.2f",
                janessa.getName(), janessa.getTaxRate(), totalTaxCharge);
        System.out.printf("%n%s's tax rate is: %.2f and her total tax charge is: %.2f",
                fred.getName(), fred.getTaxRate(), totalTaxCharge2);
        System.out.printf("%n%s's tax rate is: %.2f and her total tax charge is: %.2f",
                jake.getName(), jake.getTaxRate(), totalTaxCharge3);
    }

}
