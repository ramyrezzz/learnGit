package ro.fasttrackit.oop.person;

public class FeedablePerson extends Survival implements Feedable {

    private final String name;
    protected boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full: %s%n", name, this.full);
        return full;
    }

    @Override
    public void eat(String food) {
        System.out.printf("Person ears %s%n", food);
    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Person %s, eats %s%n", name, food);
        System.out.printf("Person %s is full %s%n", name, isFull);
    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Person %s, eats %s%n", name, liquid);
    }

    @Override
    public void scream() {
        System.out.println("Person Screams !!");
    }
}
