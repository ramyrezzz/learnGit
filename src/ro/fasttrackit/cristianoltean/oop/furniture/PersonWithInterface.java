package ro.fasttrackit.cristianoltean.oop.furniture;

public class PersonWithInterface implements CristianOltean.Feedable {

    private final String name;
    private boolean full = false;

    public PersonWithInterface(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full: %s%n", name, full);
        return full;
    }


    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void drink(String liquid) {

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Person %s, eats %s.%n", name, food);
        this.full = isFull;
        isFull();

    }
}
