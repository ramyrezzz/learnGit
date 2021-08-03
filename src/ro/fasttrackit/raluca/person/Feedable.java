package ro.fasttrackit.raluca.person;

public interface Feedable {
    void eat();
    void eat (String food);
    void eat (String food, boolean isFull);

    void drink();
    void drink(String liquid);

    void run();


}
