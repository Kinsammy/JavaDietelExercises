package chapter17.functionalInterFace.supplier;

//        todo supplier takes nothing but return something

import java.util.Random;
import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> new Random().nextInt(10);
//        System.out.println(supplier.get() +" ") todo this generate once but the loop repeat it till ten times;

        for (int i = 0; i < 10; i++){
            System.out.print(supplier.get() +" ");
        }
    }
}
