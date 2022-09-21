package chapter4;

public class TaxCalculator {
        private double taxRate;
        private double earnings;
        private String name;

        public TaxCalculator(String name, double earnings) {
            this.name = name;
            this.earnings = earnings;


        }

        public double getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(double taxRate) {
            if(earnings > 30000) {
                taxRate = .2;
            }
            else {
                taxRate = .15;
            }
            this.taxRate = taxRate;
        }

        public double getEarnings() {
            return earnings;
        }

        public void setEarnings(double earnings) {
            this.earnings = earnings;
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }

}
