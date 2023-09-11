import chapter9.Dog;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void speakTest(){
//      This instantiation will out all the constructors
        Dog aja = new Dog();
        aja.speak();
    }
}
