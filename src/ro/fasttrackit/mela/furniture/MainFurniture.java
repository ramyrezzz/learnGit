package ro.fasttrackit.mela.furniture;

public class MainFurniture {
    public static void main(String[] args) {
        Furniture myFurniture = new Furniture(
                "Yellow",
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
                55,
                45
        );
        //mySecondChair.setHeight(45);
        //mySecondChair.setWidth(45);

        Closet myCloset = new Closet(
                "Whitw",
                "wood",
                170,
                2,
                "sliding door"
        );
        System.out.println("My Furniture is : " + myFurniture.getColor());
        System.out.println("My first chair hight is : "+ myChair.getHeight());
        System.out.println("My second chair hight is : "+ mySecondChair.getHeight());
        System.out.println("My Chair is : " + myChair.getColor());
        System.out.println("My Chair has head rest : " + myChair.isHeadRest());
        System.out.println("My Closet has : " + myCloset.getDoorCount() + " doors");
    }
}
