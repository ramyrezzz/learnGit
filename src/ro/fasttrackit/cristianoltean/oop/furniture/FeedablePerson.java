package ro.fasttrackit.cristianoltean.oop.furniture;

public class FeedablePerson extends Survival implements Feedable {

    private final String name;
    private boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full: %s%n", name, this.full);
        return full;
    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Person %s drinks %s %n", name, liquid);

    }

    @Override
    public void eat(String food) {
        System.out.printf("Person eats %s %n", food);

    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Person %s eats %s.%n", name, food);
        System.out.printf("Person %s is full: %s%n", name, isFull);
    }

    @Override
    public void scream() {
        System.out.println("Person Screams");
    }
}
