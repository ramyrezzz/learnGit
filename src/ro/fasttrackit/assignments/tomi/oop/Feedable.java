package ro.fasttrackit.assignments.tomi.oop;

public interface Feedable {
    void eat();
    void eat(String food);
    void eat(String food, boolean isFull);

    void drink();
    void drink(String liquid);
}
