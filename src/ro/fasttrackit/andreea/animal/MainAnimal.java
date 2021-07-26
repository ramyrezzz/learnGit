package ro.fasttrackit.andreea.animal;

import ro.fasttrackit.andreea.person.Feedable;
import ro.fasttrackit.andreea.person.FeedablePerson;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {

    public static void main(String[] args) {

        Dog animal = new Dog("Thor");
        Feedable person = new FeedablePerson("Vasile");
        Feedable personOne = new FeedablePerson("Jose");

        animal.bark();

        /*animal.eat("Bananas", true);
        animal.run();
        person.eat("Bananas", true);
        person.run();
        personOne.eat("chili con carne");
        personOne.drink("tequila");*/

        List<Feedable> myList = new ArrayList<>();
        myList.add(personOne);
        myList.add(person);
        myList.add(animal);

        for (Feedable feedable : myList) {
            System.out.println(feedable.name());
            feedable.eat();
            feedable.run();
            feedable.drink();
            if(feedable instanceof Dog) {//type casting
                ((Dog) feedable).scream();
                ((Dog) feedable).bark();
            }
        }
    }
}
