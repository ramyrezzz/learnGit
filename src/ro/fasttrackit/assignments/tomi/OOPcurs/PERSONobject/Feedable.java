package ro.fasttrackit.assignments.tomi.OOPcurs.PERSONobject;

public interface Feedable {

    void drink();
    void drink(String liquid);


    void eat();
    void eat(String food);
    void eat(String food, boolean isFull);


    void run();
}
