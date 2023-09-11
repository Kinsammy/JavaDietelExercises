package leetCode;

import org.junit.jupiter.api.Test;

import static leetCode.MaxWealth.maximumWealth;
import static org.junit.jupiter.api.Assertions.*;

class MaxWealthTest {

    @Test
    void maximumWealthTest() {
//        Given the account of 3 customer with 3 accounts
        int[][] accounts = {{1,2,3},{9,6,1},{3,3,7}};
        int wealth = maximumWealth(accounts);
        assertEquals(16, wealth);
    }
}