package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary sammyDiary;
    @BeforeEach
    public void setUp(){
         sammyDiary = new Diary("Samuel", "correctPassword");
    }

    @Test
    public void diaryExistTest(){
        assertNotNull(sammyDiary);
    }

    @Test
    public void newDiaryIsLocked(){
        assertTrue(sammyDiary.isLocked());
    }

    @Test
    public void lockedDiaryCanBeUnlockedTest(){
        assertTrue(sammyDiary.isLocked());
        sammyDiary.unlockWith("correctPassword");
        assertFalse(sammyDiary.isLocked());
    }

    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(sammyDiary.isLocked());
        sammyDiary.unlockWith("wrongPassword");
        assertTrue(sammyDiary.isLocked());
    }

    @Test
    public void diaryCanBeLockedTest() {
        sammyDiary.unlockWith("correctPassword");
        assertFalse(sammyDiary.isLocked());

        sammyDiary.lock();
        assertTrue(sammyDiary.isLocked());
    }

    @Test
    public void happeningsCanBeAddedToTheDiary() {
        sammyDiary.unlockWith("correctPassword");
        assertFalse(sammyDiary.isLocked());
        sammyDiary.write("My name is Samuel Fanu",
                "I was deployed to Benue, but i'm not happy about it and...");
        assertEquals(1, sammyDiary.numberOfEntries());
    }

    @Test
    public void entriesCannotBeAddedWhenDiaryIsLockedTest() {
        sammyDiary.write("My name is Samuel Fanu",
                "I was deployed to Benue, but i'm not happy about it and...");
        assertEquals(0, sammyDiary.numberOfEntries());
    }

    @Test
    public void entriesCanFoundByIdTest(){
        sammyDiary.unlockWith("correctPassword");
        assertFalse(sammyDiary.isLocked());
        sammyDiary.write("My name is Samuel Fanu",
                "I was deployed to Benue, but i'm not happy about it and...");
        assertEquals(1, sammyDiary.numberOfEntries());

        Entry foundEntry = sammyDiary.findEntryWith(1);
        assertEquals(1, foundEntry.getId());
        assertEquals("My name is Samuel Fanu", foundEntry.getTitle());
        assertEquals("I was deployed to Benue, but i'm not happy about it and...", foundEntry.getBody());
    }
}
