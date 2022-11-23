package chapter9;

public class Dog extends Animal{

    public Dog(){
        System.out.println("Who is creating Dog");
    }
    @Override
    public void speak() {
        System.out.println("Bark like a local dog");
    }

    public void fatherSpeak(){
        super.speak();
    }
}
