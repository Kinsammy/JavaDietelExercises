import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class AgeFormatterTest {

    @Test
    void ageFormatterTest() {
        String birthday = "15/05/2021";
        int age = AgeFormatter.ageFormatter(birthday);
        assertEquals(1, age);
    }

    @Test
    void dateFormatTest(){
        String birthday = "15/05/2021";
        String date = AgeFormatter.dateFormat(birthday);
        assertEquals("Tuesday, 15 may, 2021", date);
    }



}