package ro.fasttrackit.cristianoltean.oop.furniture;

public interface Feedable {
    void eat();
    void drink();
    void drink(String liquid);
    void eat(String food);
    void eat(String food, boolean isFull);
}
