package ro.fasttrackit.andreea.furniture;

public class MainFurniture {

    public static void main(String[] args) {

        Furniture myFurniture = new Furniture(
                "Grey",
                "wood");

        Chair myChair = new Chair(
                "Red",
                "steel",
                50,
                50,
                false,
                true,
                true);

        Chair mySecondChair = new Chair(myFurniture, true,true,true,20,20);

        Closet myCloset = new Closet(
                "Red", "steel", 170, 75, false, 2, "sliding doors");

        mySecondChair.setHeight(40);
        mySecondChair.setWidth(45);

        System.out.println("My furniture is: " + myFurniture.getColor());
        System.out.println("My chair is: " + myChair.getColor());
        System.out.println("My chair has head rest: " + myChair.isHeadRest());
        System.out.println("My closet has " + myCloset.getDoorCount() + " doors");
        System.out.println("My chair is "+ mySecondChair.getHeight());
    }
}
