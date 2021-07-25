package ro.fasttrackit.mela.oop;

public class Dog extends Animal implements Reaction {
    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("Ham Ham ");
    }

    @Override
    public void bite() {
        System.out.println("I can bite");
    }
    @Override
    public void scream() {
        bark();;
    }

}
