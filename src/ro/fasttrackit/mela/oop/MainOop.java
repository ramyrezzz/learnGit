package ro.fasttrackit.mela.oop;

import java.util.ArrayList;
import java.util.List;

public class MainOop {
    public static void main(String[] args) {
        //s-a implementat Polimorfismul : acelasi obiect poate sa aiba implementari total
        //diferite printr-o interfata

        Feedable firstPerson = new FeedablePerson("Mela");
        Feedable firstAnimal = new Animal();
        Feedable secondPerson = new FeedablePerson("Zoia");

        List<Feedable> myList = new ArrayList<>();
        myList.add(firstPerson);
        myList.add(secondPerson);
        myList.add(firstAnimal);

        for (Feedable feedable : myList) {
            System.out.println(feedable.name());
            feedable.eat();
            feedable.run();
            feedable.drink();
        }

//        firstPerson.eat("Salade", true);
//        System.out.println();
//
//        firstAnimal.eat();;
//        firstAnimal.eat("Meat");;
//        firstAnimal.drink("Water");;
//        firstAnimal.run();
//        System.out.println();
//
//        secondPerson.eat("Cooked meat", true);
//        secondPerson.run();

        /*
        firstPerson.drink("Water");
        firstPerson.eat("Meat");
        secondPerson.eat();
        secondPerson.drink();
        secondPerson.run();
        secondPerson.run("in the Sports Base");
         */

    }
}
