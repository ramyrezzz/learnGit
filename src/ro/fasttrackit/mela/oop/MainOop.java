package ro.fasttrackit.mela.oop;

import java.util.ArrayList;
import java.util.List;

public class MainOop {
    public static void main(String[] args) {
        //s-a implementat Polimorfismul : acelasi obiect poate sa aiba implementari total
        //diferite printr-o interfata

        Feedable firstPerson = new FeedablePerson("Mela");
        Feedable secondPerson = new FeedablePerson("Zoia");
        //Feedable firstAnimal = new Dog("Spark");
        Dog firstAnimal = new Dog("Spark");

        firstAnimal.bark();;

        List<Feedable> myList = new ArrayList<>();
//        myList.add(firstPerson);
//        myList.add(secondPerson);
        myList.add(firstAnimal);

       /* for (int i=0; i< myList.size(); i++){
            Feedable feedable = myList.get(i);
            feedable.eat();
        }*/

        for (Feedable feedable : myList) {
            System.out.println(feedable.name());
            feedable.eat();
            feedable.run();
            feedable.drink();
            if (feedable instanceof Dog) {
                //type casting - un obiect este castat intr-un alt tip de clasa
                ((Dog) feedable).bite();
                ((Dog) feedable).bark();
                ((Dog) feedable).scream();
            }
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
