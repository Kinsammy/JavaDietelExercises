package revisionWithChief.exercisesWithChief;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolAdminTest {
    private int[][] scores = {{98, 79, 77, 95, 84}, {83, 89, 74, 91, 90}};
    private SchoolAdmin admin;

    @BeforeEach
    public void setUp(){
        admin = new SchoolAdmin(scores);
    }

    @Test
    public void calculateAverageScore(){
        admin.calculateAverage();
        double[] average = admin.getAverageScores();
        assertTrue(average[0] > 0);
        assertTrue(average[1] > 0);

        assertTrue(average[0] > 86.6);
        assertTrue(average[1] > 85.4);
//        assertArrayEquals(new double[]{88.5, 86.0}, average);
    }

}