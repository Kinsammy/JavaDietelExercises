package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double perLiterPrice;
    private double discountPercentage;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double perLiterPrice, double discountPercentage) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.perLiterPrice = perLiterPrice;
        this.discountPercentage = discountPercentage;
    }

    public void setLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public String getlocation(){
        return stationLocation;
    }

    public void setType(String petrolType){
        this.petrolType = petrolType;
    }

    public String getType(){
        return petrolType;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return  quantity;
    }

    public void setPrice(double perLiterPrice){
        this.perLiterPrice = perLiterPrice;
    }

    public double getPrice(){
        return perLiterPrice;
    }

    public void setDiscount(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }

    public Object getDiscount() {
        return discountPercentage;
    }

    public double getPurchaseAmount(){
        double purchaseAmount = (quantity * perLiterPrice) - discountPercentage;
        return purchaseAmount;
    }
}
