package ro.fasttrackit;

import ro.fasttrackit.furniture.Chair;
import ro.fasttrackit.furniture.Closet;
import ro.fasttrackit.furniture.Furniture;

public class Main {

    public static void main(String[] args) {
        PersonWithInterface firstPerson = new PersonWithInterface("Rami");
        firstPerson.eat("Salad", false);



        Furniture myFurniture = new Furniture(
                "Grey",
                "wood"
        );

        Chair myChair = new Chair(
                "Red",
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
                "Red",
                "steel",
                170,
                2,
                "Sliding doors"
        );

//        System.out.println("My myFurniture is : " + myFurniture.getColor());
//        System.out.println("My 2ndmyChair height is: " + mySecondChair.getHeight());
//        System.out.println("My Chair is : " + myChair.getColor());
//        System.out.println("My Chair has Head Rest : " + myChair.isHeadRest());
//        System.out.println("My Closet has " + myCloset.getDoorCount() + " Doors");
    }
}
// ALT + ENTER
// SHIFT + F6
// Ctrl + ALT + V => Variable
// CTRL + ALT + M => Method
// CTRL + ALT + C => Constant
// CTRL + ALT + L => Reformat code !

