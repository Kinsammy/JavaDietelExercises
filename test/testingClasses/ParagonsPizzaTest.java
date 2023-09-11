package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParagonsPizzaTest {
    @Test
    public void isObjectExist(){
        ParagonsPizza pizza = new ParagonsPizza();
        assertNotNull(pizza);
    }

    @Test
    public void pizzaPriceTest(){
        ParagonsPizza pizza = new ParagonsPizza();
        assertEquals(12_000,pizza.paragons(12_000, 0, 1) );
    }

    @Test
    public void moneyAtHandTest(){
        ParagonsPizza pizza = new ParagonsPizza();
        assertEquals(-4_300,pizza.paragons(0, 4_300, 1) );
    }

    @Test
    public void peopleFeeTest(){
        ParagonsPizza pizza = new ParagonsPizza();
        assertEquals(77,pizza.paragons(12_000, 4_300, 100));
     }

}
