package ro.fasttrackit;

import ro.fasttrackit.person.*;
import ro.fasttrackit.person.Feedable;

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
