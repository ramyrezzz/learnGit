package ro.fasttrackit.raluca.animal;

import ro.fasttrackit.raluca.animal.Animal;
import ro.fasttrackit.raluca.person.Reaction;

public class Dog extends Animal implements Reaction {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void scream() {
        bark();
    }

    public void bark() {
        System.out.println("Ham Ham !!");
    }

    @Override
    public void bite() {
        System.out.println("I can bite!");
    }
}
