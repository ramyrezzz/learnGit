package ro.fasttrackit.cristianoltean.oop.furniture;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Feedable person = new FeedablePerson("Oltean");
        Feedable personOne = new FeedablePerson ("Cristian");
        Dog animal = new Dog("Spark ");

//        animal.eat("Bananas", true);
//        animal.run();
//        person.eat("Bananas", true);
//        person.run();
//        personOne.eat("Cooked meat", true);
//        personOne.run();

        List<Feedable> myList = new ArrayList<>();
        myList.add(person);
        myList.add(personOne);
        myList.add(animal);

        for (Feedable feedable : myList) {
            System.out.println(feedable.getName());
            feedable.eat();
            feedable.run();
            feedable.drink();
            if (feedable instanceof Dog)
                ((Dog) feedable).scream();
            if (feedable instanceof Dog)
                ((Dog) feedable).bark();

        }

//        myListOfStrings.add("Cristian as a name");
//
//        System.out.println(myListOfStrings.size());
//        System.out.println(myListOfStrings.contains(person));
//        myList.get(0).eat("Pizza", false);
//        myList.get(1).eat("fasole batuta", true);

//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person(args[0]);
//        person.isFull();
//        person.run();
//        person.eat();
//        person.dance();
//        person.tired();
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
////        PersonWithInterface firstPerson = new PersonWithInterface ("Cristian");
//        firstPerson.eat("salad", false);
//
//
//        Furniture myFurniture = new Furniture(
//                "Grey",
//                "wood"
//        );
//
//        Chair myChair = new Chair(
//                "red",
//                "steel",
//                50,
//                35,
//                true,
//                true,
//                true
//        );
//        Chair mySecondChair = new Chair(
//                myFurniture,
//                false,
//                false,
//                false,
//                50,
//                50
//         );
////        mySecondChair.setHeight(60);
////        mySecondChair.setWidth(45);
//
//        Closet myCloset = new Closet(
//                "red",
//                "steel",
//                170,
//                2,
//                "Sliding doors"
//        );

//        System.out.println("My myFurniture is: " + myFurniture.getColor());
//        System.out.println("My furniture height is: " + myFurniture.getHeight());
//        System.out.println("My second chair is: " + mySecondChair.getHeight());
//        System.out.println("My Chair is : " + myChair.getColor());
//        System.out.println("My Chair has HeadRest: " + myChair.isHeadRest());
//        System.out.println("My Closet has " + myCloset.getDoorCount() + " Doors");

    }
}
