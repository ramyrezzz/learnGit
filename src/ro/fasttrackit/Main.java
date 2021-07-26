package ro.fasttrackit;

import ro.fasttrackit.furniture.Chair;
import ro.fasttrackit.furniture.Closet;
import ro.fasttrackit.furniture.Furniture;

public class Main {
    public static void main(String[] args) {
        PersonWithInterface firstPerson = new PersonWithInterface("Mirela");
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
        Chair my2ndChair = new Chair(
            myFurniture,
                false,
                false,
                false,
                50,
                50
        );
        my2ndChair.setHeight(60);
        my2ndChair.setWidth(45);

        Closet myCloset = new Closet(
               "Red",
                "steel",
                170,
                2,
                "Sliding doors"
        );
        System.out.println("My myFurniture is : " + myFurniture.getColor());
        System.out.println("My my2ndChair height is : " + my2ndChair.getHeight());
        System.out.println("My Chair is : " + myChair.getColor());
        System.out.println("My Chair has Head Rest : " + myChair.isHeadRest());
        System.out.println("My Closet has  " + myCloset.getDoorCount() + " Doors");
    }

}
