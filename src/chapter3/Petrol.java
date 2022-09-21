package chapter3;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase firstPurchase = new PetrolPurchase("Apapa", "Oando", 50, 170.0, 0.5);

        System.out.printf("The First purchase details is Station is: %s\nPetrol Type is: %s\nQuantity: %d\nPer liter Price is: %.2f\nDiscount percentage is: %.2f%n",
                firstPurchase.getlocation(),firstPurchase.getType(),firstPurchase.getQuantity(),firstPurchase.getPrice(),firstPurchase.getDiscount());
        System.out.printf("The purchase Amount is %.2f", firstPurchase.getPurchaseAmount());
    }
}
