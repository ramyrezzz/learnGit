package ro.fasttrackit.mela.oop;

public interface Feedable {
    void eat();

    void eat(String food);

    void eat(String food, boolean full);

    void drink();

    void drink(String liquid);

    void run();

    void run(String location);
}
