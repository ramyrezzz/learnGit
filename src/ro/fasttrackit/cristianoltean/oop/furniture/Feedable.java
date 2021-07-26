package ro.fasttrackit.cristianoltean.oop.furniture;

public interface Feedable {
    String getName();

    void eat();
    void eat(String food);
    void eat(String food, boolean isFull);

    void drink();
    void drink(String liquid);

    void run();
}
