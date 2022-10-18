package testingClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NumberOfPeopleTest {
    @Test
    public void isObjectExist(){
        NumberOfPeople people = new NumberOfPeople();
        assertNotNull(people);
    }

    @Test
    public void nobodyInTheRoomTest(){
        NumberOfPeople people = new NumberOfPeople();
        assertEquals(0,   people.countPeopleInRoom(0));
    }

    @Test
    public void onePersonInTheRoomTest(){
        NumberOfPeople people = new NumberOfPeople();
        assertEquals(1,   people.countPeopleInRoom(1));
    }

    @Test
    public void twoPeopleInTheRoomTest(){
        NumberOfPeople people = new NumberOfPeople();
        assertEquals(2,   people.countPeopleInRoom(2));
    }

    @Test
    public void threePeopleInTheRoomTest(){
        NumberOfPeople people = new NumberOfPeople();
        assertEquals(3,   people.countPeopleInRoom(3));
    }

    @Test
    public void onePeopleLeftTheRoomTest(){
        NumberOfPeople people = new NumberOfPeople();
        assertEquals(2,   people.countPeopleLeftRoom(2));
    }

}
