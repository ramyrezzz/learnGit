package ro.fasttrackit;

import ro.fasttrackit.person.Animal;
import ro.fasttrackit.person.Feedable;
import ro.fasttrackit.person.FeedablePerson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Feedable person = new FeedablePerson("Rami");
        Feedable personOne = new FeedablePerson("One");
        Feedable animal = new Animal();

        List<Feedable> myList = new ArrayList<>();
        myList.add(person);
        myList.add(personOne);
        myList.add(animal);

        for (Feedable feedable : myList) {
            feedable.eat();
        }

//        person.eat("Bananas", true);
//        person.run();
//        animal.eat("Bananas", true);
//        animal.run();
//        personOne.eat("Cooked meat", true);
//        personOne.run();
    }
}


