package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

    @Test
    public void addItemListSizeIncreasesTest(){
        MyArrayList guitarStrings = new MyArrayList();
        guitarStrings.add("G-String");
        guitarStrings.add("F-String");

        assertEquals(2, guitarStrings.size());
    }
//
//    @Test
//    public void addOneItemByIndexText(){
//        MyArrayList guitarStrings = new MyArrayList();
//        guitarStrings.add("G-String");
////        String result = guitarStrings.get(0);
//        assertEquals("G-String", result);
//    }
}
