package applicationPackages;

import java.util.ArrayList;

public class CheckOutMethod {
    public ArrayList<String> myList = new ArrayList<>();
    public static double totalPrice(double quantity, double unitPrice){
        return quantity * unitPrice;
    }



    public static double grandTotal(ArrayList<Integer> quantityList, ArrayList<Double> unitPriceList){
        double grandTotal = 0;
        for (int index = 0; index < unitPriceList.size(); index++){
            grandTotal += quantityList.get(index) * unitPriceList.get(index);
        }
        return grandTotal;
    }

    public static void display(ArrayList<String> itemList,
                               ArrayList<Integer> quantityList, ArrayList<Double> unitPriceList){
        System.out.printf("%n%10s%20s%20s%20s%n", "Item", "Quantity", "Unit Price", "Total");
        for (int index = 0; index < itemList.size();index++){
            System.out.printf("%10s%20d%20.2f%20.2f%n", itemList.get(index), quantityList.get(index),
                    unitPriceList.get(index),(quantityList.get(index) * unitPriceList.get(index)));
            if (index == itemList.size()-1){
                System.out.printf("%50s%20.2f", "Grand Total",
                        grandTotal(quantityList, unitPriceList));
            }
        }
    }
}
