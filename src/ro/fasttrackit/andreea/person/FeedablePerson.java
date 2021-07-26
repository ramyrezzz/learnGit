package ro.fasttrackit.andreea.person;

import ro.fasttrackit.andreea.animal.Survival;

public class FeedablePerson extends Survival implements Feedable {

    private final String name;
    private boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full:%s%n", name, this.full);
        return full;
    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Person %s eats %s%n", name, liquid);
    }

    @Override
    public void eat(String food) {
        System.out.printf("Person eats: %S%n", food);
    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Person %s eats %s%n", name, food);
        this.full = isFull;
        isFull();
    }

    /*@Override
    public void bark() {
        bite();
    }

    @Override
    public void bite() {
        System.out.println("I can speak");
    }*/

    @Override
    public void scream() {
        System.out.println("Person screams");
    }
}
