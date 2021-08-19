package ro.fasttrackit.oop.person;

public interface Feedable {
    String name();

    void eat();

    void eat(String food);

    void eat(String food, boolean isFull);

    void drink();

    void drink(String liquid);

    void run();
}
