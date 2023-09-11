package chapter16.optionalClass;

import chapter10.Animal;
import chapter10.Cat;

import java.util.Optional;

public class SampleOne {
    public static void main(String[] args) {
        Optional<Animal> foundAnimal = geAnimal();
        Animal animal = foundAnimal.get();
        animal.speak();
        Animal animal2 = new Cat();
        animal2.speak();

        Animal animal1 = foundAnimal.orElseThrow(()-> new RuntimeException("Animal not found"));
        animal2.move();
    }

    private static Optional<Animal> geAnimal(){
        Animal animal = new Animal();
        return Optional.of(animal);
    }
}
