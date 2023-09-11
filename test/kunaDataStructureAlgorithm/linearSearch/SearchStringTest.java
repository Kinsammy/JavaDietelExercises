package kunaDataStructureAlgorithm.linearSearch;

import org.junit.jupiter.api.Test;

import static kunaDataStructureAlgorithm.linearSearch.SearchString.search;
import static kunaDataStructureAlgorithm.linearSearch.SearchString.searchTwo;
import static org.junit.jupiter.api.Assertions.*;

class SearchStringTest {

    @Test
    public void searchForCharacterTest(){
        String name = "Fanu Samuel Ibukun";
        char target = 'a';
        boolean isExist = search(name, target);
       assertTrue(true, String.valueOf(isExist));
    }

    @Test
    public void searchForCharacterIndexTest(){
        String name = "Fanu Samuel Ibukun";
        char target = 'a';
        boolean isExist = searchTwo(name, target);
        assertTrue(true, String.valueOf(isExist));
    }

}