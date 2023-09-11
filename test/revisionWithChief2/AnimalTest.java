package revisionWithChief2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import revisionWithChief.animal.Animal;
import revisionWithChief.animal.Dog;
import revisionWithChief.animal.Python;

public class AnimalTest {
    @BeforeEach
    public void setUp(){

    }

    @Test
    public void checkAnimal(){
        Animal bessie = new Dog();
        bessie.setId(1);
        bessie.setName("Chelsea");
        bessie.move();

        Dog bingo = new Dog();
        bingo.setId(2);
        bingo.setName("Pooh");
        bingo.move();

        bessie = new Python();
        bessie.move();


    }
}
