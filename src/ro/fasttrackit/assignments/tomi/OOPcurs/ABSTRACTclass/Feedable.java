package ro.fasttrackit.assignments.tomi.OOPcurs.ABSTRACTclass;

public interface Feedable {

    void eat();           //OVERLOADING aceeasi metoda are mai multe semnaturi variante

    void eat(String food);

    void eat(String food, boolean isFull);

    void drink();

    void drink(String liquid);

    void run();
}
