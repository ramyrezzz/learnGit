package ro.fasttrackit.mela.oop;

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
        System.out.printf("%s is full: %s%n", name, full);
        return full;
    }
// Metoda eat() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
//    @Override
//    public void eat() {
//        System.out.printf("Person " + getName() + " eats %n");
//    }

    @Override
    public void eat(String food) {

        System.out.printf("Person " + name() + " eats %s%n", food);
    }

    @Override
    public void eat(String food, boolean isfull) {
        System.out.printf("Person %s, eats %s%n", name, food);
        this.full = isfull;
        isFull();

    }
// Metoda drink() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
//    @Override
//    public void drink() {
//
//        System.out.printf("Person " + name() + " drinks %n");
//    }

   @Override
    public void drink(String liquid) {
        System.out.printf("Person " + name() + " drinks %s%n", liquid);
    }

// Metoda run() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
//    @Override
//    public void run() {
//        System.out.println("Person " + name() + " runs");
//    }

    @Override
    public void run(String location) {
        System.out.printf("Person " + name() + " runs %s%n", location);
    }

    @Override
    public void scream() {
        System.out.println("Person Screams ");
    }
}
