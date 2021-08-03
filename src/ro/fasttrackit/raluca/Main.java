package ro.fasttrackit.raluca;

import ro.fasttrackit.oop.animal.Dog;
import ro.fasttrackit.oop.person.*;
import ro.fasttrackit.oop.person.Feedable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Feedable person = new FeedablePerson("Rami");
        Feedable personOne = new FeedablePerson("One");
        Dog animal = new Dog("Spark");

        List<Feedable> myList = new ArrayList<>();
        myList.add(animal);

        for (Feedable feedable : myList) {
            System.out.println(feedable.name());
            feedable.eat();
            feedable.run();
            feedable.drink();
            if (feedable instanceof Dog) {
                ((Dog) feedable).scream();
                ((Dog) feedable).bark();
            }
        }
    }
}
