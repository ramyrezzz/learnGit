package ro.fasttrackit.assignments.tomi.oop;


public class PersonWithInterface implements Feedable {

    private final String name;
    private boolean full = false;

    public PersonWithInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void eat(String food, boolean isFull) {

    }
}
