package ro.fasttrackit.assignments;

import ro.fasttrackit.TemeRaul.Animal;
import ro.fasttrackit.TemeRaul.Feedable;
import ro.fasttrackit.TemeRaul.FeedablePerson;

import java.util.List;

public class CallAnimal {
    public static void main(String[] args) {

        Feedable animal = new Animal();
        Feedable person = new FeedablePerson("Raul");
        Feedable personOne = new FeedablePerson("One");



        animal.eat("Bananas", true);
        animal.run();
        person.eat("Bananas",true);
        person.run();
        personOne.eat("Cooked meat",true);
        personOne.run();
    }
}

// (polimorfism)
// Acelasi obiect poate sa aiba 2 metode diferite printr-o interfata