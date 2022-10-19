package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTest {

    @Test
    public void objectExistenceTest(){
        ArrayOperation operation = new ArrayOperation();
        assertNotNull(operation);
    }

    @Test
    public void sumOfArrayTest(){
        assertEquals(15,ArrayOperation.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maximumOfArrayTest(){
        assertEquals(5,ArrayOperation.maximum(new int[]{1, 2, 3, 4, 5}));
    }


    @Test
    public void minimumOfArrayTest(){
        assertEquals(1,ArrayOperation.minimum(new int[]{1,2, 3, 4, 5}));
    }

    @Test
    public void indexArrayMinTest(){
        assertEquals(10,ArrayOperation.arrayMin(new int[]{5, 2, 3, 1, 4}));
    }

    public void indexArrayMaxTest(){
        assertEquals(1,ArrayOperation.arrayMax(new int[]{5, 2, 3, 1, 4}));
    }
}
