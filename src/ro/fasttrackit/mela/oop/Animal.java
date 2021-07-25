package ro.fasttrackit.mela.oop;

public class Animal extends Survival implements Feedable{
    private boolean isfull = false;

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

// Metoda eat() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
// Se elimina astfel duplicarea metodei in cel 2 clase Animal si FeedablePerson
//    @Override
//    public void eat() {
//        System.out.printf("Animal eats%n");
//    }

    @Override
    public void eat(String food) {
        System.out.printf("Animal eats: %s%n", food);

    }

    @Override
    public void eat(String food, boolean isfull) {
        System.out.printf("Animal eats: %s%n", food);
        System.out.printf("Animal is full: %s%n", isfull);
        this.isfull = isfull;
    }
// Metoda drink() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
// Se elimina astfel duplicarea metodei in cel 2 clase Animal si FeedablePerson
//    @Override
//    public void drink() {
//        System.out.printf("Animal drinks%n");
//    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Animal drinks : %s%n", liquid);
    }

// Metoda run() comuna pt Animal si FeedablePerson se elimina de aici si
// se creaza o clasa abstracta Survival cere le contine
// Se elimina astfel duplicarea metodei in cel 2 clase Animal si FeedablePerson
//    @Override
//    public void run() {
//
//    }

    @Override
    public void run(String location) {
        System.out.printf("Animal runs in %s%n", location);
    }

    @Override
    public void scream() {
        System.out.println("Animal Screams ");
    }
}
