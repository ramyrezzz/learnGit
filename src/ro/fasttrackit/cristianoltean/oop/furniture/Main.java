package ro.fasttrackit.cristianoltean.oop.furniture;

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

public class Main {
    public static void main(String[] args) {
        PersonWithInterface firstPerson = new PersonWithInterface ("Cristian");
        firstPerson.eat("salad", false);


        Furniture myFurniture = new Furniture(
                "Grey",
                "wood"
        );

        Chair myChair = new Chair(
                "red",
                "steel",
                50,
                35,
                true,
                true,
                true
        );
        Chair mySecondChair = new Chair(
                myFurniture,
                false,
                false,
                false,
                50,
                50
         );
//        mySecondChair.setHeight(60);
//        mySecondChair.setWidth(45);

        Closet myCloset = new Closet(
                "red",
                "steel",
                170,
                2,
                "Sliding doors"
        );

//        System.out.println("My myFurniture is: " + myFurniture.getColor());
//        System.out.println("My furniture height is: " + myFurniture.getHeight());
//        System.out.println("My second chair is: " + mySecondChair.getHeight());
//        System.out.println("My Chair is : " + myChair.getColor());
//        System.out.println("My Chair has HeadRest: " + myChair.isHeadRest());
//        System.out.println("My Closet has " + myCloset.getDoorCount() + " Doors");

    }
}
