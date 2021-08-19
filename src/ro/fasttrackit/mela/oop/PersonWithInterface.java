package ro.fasttrackit.mela.oop;

public class PersonWithInterface implements Feedable {
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
        System.out.printf("Person " + getName() + " eats %n");
    }

    @Override
    public void eat(String food) {
        System.out.printf("Person " + getName() + " eats %s%n", food);
    }

    @Override
    public void eat(String food, boolean isfull) {
        System.out.printf("Person %s, eats %s%n", name, food);
        this.full = isfull;
        isFull();

    }

    @Override
    public void drink() {
        System.out.printf("Person " + getName() + " drinks %n");
    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Person " + getName() + " drinks %s%n", liquid);
    }

    @Override
    public void run() {
        System.out.println("Person " + getName() + " runs");
    }

    @Override
    public void run(String location) {
        System.out.printf("Person " + getName() + " runs %s%n", location);
    }
}
