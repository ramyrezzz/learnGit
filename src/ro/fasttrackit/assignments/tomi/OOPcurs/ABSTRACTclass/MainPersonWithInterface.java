package ro.fasttrackit.assignments.tomi.OOPcurs.ABSTRACTclass;

import ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Animal;
import ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable;
import ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.FeedablePerson;

import java.util.ArrayList;
import java.util.List;

public class MainPersonWithInterface {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.eat();
        animal.eat("bananas");
        animal.eat("BANANAS",true);
        animal.run();

        FeedablePerson person = new FeedablePerson("RAMI");
        person.eat();
        person.eat("bananas");
        person.eat("bananas",true);
        person.run();*/





        /*Feedable animal = new Animal();  //POLIMORFISM
        animal.eat();
        animal.eat("bananas");
        animal.eat("BANANAS",true);
        animal.run();

        Feedable person = new FeedablePerson("RAMI");  //POLIMORFISM
        person.eat();
        person.eat("bananas");
        person.eat("bananas",true);
        person.run();

        Feedable personOne = new FeedablePerson("ONE");    //POLIMORFISM
        personOne.eat();
        personOne.eat("cooked meat",true);
        personOne.run();*/





        ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable person = new ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.FeedablePerson("RAMI");
        ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable personOne = new FeedablePerson("ONE");
        ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable animal = new Animal();

        List<ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable> myList = new ArrayList<>();
        myList.add(person);
        myList.add(personOne);
        myList.add(animal);

        for (Feedable feedable : myList){
            feedable.eat();
        }

    }
}
