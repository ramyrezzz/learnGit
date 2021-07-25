package ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject;

public class MainMostenire {
    public static void main(String[] args) {
        ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject.Furniture myFurniture = new Furniture("Yellow", "wood", 70, 40, true);
        System.out.println("My furniture is : " + myFurniture.getColor());
        System.out.println("My furniture is : " + myFurniture.getMaterial());
        System.out.println("My furniture is : " + myFurniture.getHeight());
        System.out.println("My furniture is : " + myFurniture.getWidth());
        System.out.println("My furniture is : " + myFurniture.isForDesk());

        ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject.Chair myChair = new Chair("Red", "Steel", 50, 35, true, true, true);
        {
            System.out.println("My chair is : " + myChair.getColor());
            System.out.println("My chair is : " + myChair.getMaterial());
            System.out.println("My chair is : " + myChair.getHeight());
            System.out.println("My chair is : " + myChair.getWidth());
            System.out.println("My chair is :  " + myChair.isForDesk());

            System.out.println("My chair is : " + myChair.isHeadRest());
            System.out.println("My chair is : " + myChair.isArmRest());

            ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject.Closet myCloset = new Closet("Green","steel",170,75,false,2,"sliding doors");
            {
                System.out.println("My closet is : " + myCloset.getColor());
                System.out.println("My closet is : " + myCloset.getMaterial());
                System.out.println("My closet is : " + myCloset.getHeight());
                System.out.println("My closet is : " + myCloset.getWidth());
                System.out.println("My closet is : " + myCloset.isForDesk());
                System.out.println("My closet is : " + myCloset.getDoorCount() + " doors");
                System.out.println("My closet is : " + myCloset.getDoorType() + " type");
            }
        }
    }
}


