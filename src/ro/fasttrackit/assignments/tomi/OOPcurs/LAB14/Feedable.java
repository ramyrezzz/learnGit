package ro.fasttrackit.assignments.tomi.OOPcurs.LAB14;

public interface Feedable {

    void eat();
    void eat(String food);
    void eat(String food, boolean isFull);

    void drink();
    void drink(String liquid);

    void run();
}
