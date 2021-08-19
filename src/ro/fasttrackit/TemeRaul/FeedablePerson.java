package ro.fasttrackit.TemeRaul;


public class FeedablePerson implements Feedable {

    private final String name;
    protected boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full: %s%n", name);
        return full;
    }


    @Override
    public void eat() {
        System.out.println("Person Eats");

    }

    @Override
    public void eat(String food) {
        System.out.printf("Person eats: %s", food);

    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Person %s, eats %s%n", name, food);
        System.out.printf("Person %s is Full %s%n", name, isFull);

    }

    @Override
    public void drink() {


    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Person %s eats %s%n", name, liquid);
    }

    @Override
    public void run() {
        System.out.printf("Person %s runs %n", name);

    }
}
