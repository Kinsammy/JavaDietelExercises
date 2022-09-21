package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    public void whenHourIsGreaterThan23(){
        Clock newTime = new Clock(2,23,34);
        assertEquals(2_23_34,newTime );
    }

}