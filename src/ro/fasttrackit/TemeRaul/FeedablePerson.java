package ro.fasttrackit.TemeRaul;


public class FeedablePerson extends Survival implements Feedable {

    private final String name;
    protected boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        System.out.printf("%s is full: %s%n", name );
        return full;
    }

    @Override
    public String name() {
        return null;
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
    public void drink(String liquid) {
        System.out.printf("Person %s eats %s%n", name, liquid);
    }


}
