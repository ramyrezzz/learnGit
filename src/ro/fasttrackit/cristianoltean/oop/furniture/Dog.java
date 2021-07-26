package ro.fasttrackit.cristianoltean.oop.furniture;

public class Dog extends Animal implements Reaction{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void scream() {
        bark();
    }
    public void bark() {
        System.out.println("Ham Ham!");
    }

    @Override
    public void bite() {
        System.out.println("I can bite!");
    }
}
