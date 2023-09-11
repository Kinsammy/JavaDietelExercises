package chapter10;

public abstract class Dog extends Animal implements Movable {

    public void speak(){
        System.out.println("Bark");
    }

    public void eat(){
        System.out.println("Eat bone");
    }

    @Override
    public void move(){
        System.out.println("Dog walk");
    }

    public abstract void fight();

}
