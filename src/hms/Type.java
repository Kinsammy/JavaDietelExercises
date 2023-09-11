package hms;

public enum Type {
    EXECUTIVE(15_000),
    STANDARD(10_000),
    CHEAP(5_000);
    private final int price;
    Type(int price){
        this.price = price;
    }




}
