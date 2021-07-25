package ro.fasttrackit.mela.oop;
//The interface exposes a behavior (Interfata expune un comportament)
public interface Feedable {
    String name();
    void eat();
    void eat(String food);
    void eat(String food, boolean full);

    void drink();
    void drink(String liquid);

    void run();
    void run(String location);
}
