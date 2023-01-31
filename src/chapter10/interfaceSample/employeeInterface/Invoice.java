package chapter10.interfaceSample.employeeInterface;

public class Invoice  implements Payable{
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0){
            throw new IllegalArgumentException("Quantity must be greater than or equal zero");
        }

        if (pricePerItem < 0){
            throw new IllegalArgumentException("Price per item must be be greater than or equal to zero");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "Invoice", "Part number", getPartNumber(), getPartDescription(),
                "Quantity", getQuantity(), "Price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

}
