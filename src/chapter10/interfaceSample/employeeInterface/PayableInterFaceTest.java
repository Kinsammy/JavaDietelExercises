package chapter10.interfaceSample.employeeInterface;

public class PayableInterFaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "Seat", 2, 3500),
                new Invoice("56789", "Tyre", 4, 5000),
                new Employee("John", "Smith", "111-222-333") {
                    @Override
                    public double earning() {
                        return 0;
                    }
                }
        };
        for (Payable currentPayable: payableObjects){
            System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable.toString(), currentPayable.getPaymentAmount());
        }
    }
}
