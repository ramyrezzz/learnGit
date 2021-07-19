package ro.fasttrackit.furniture;

public class Furniture {
    public static void main(String[] args) {
        myFurniture myFurniture = new myFurniture(
                "Yellow",
                "wood",
                70,
                40,
                true,
                false
        );

        System.out.println("My Furniture is : " + myFurniture.getColor());
    }
}
