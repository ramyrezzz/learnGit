package ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject;

public class Closet extends Furniture {
    private final int doorCount;
    private final String doorType;

    public Closet(String color, String material, double height, double width, boolean forDesk, int doorCount, String doorType) {
        super(color, material, height, width, forDesk);
        this.doorCount = doorCount;
        this.doorType = doorType;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public String getDoorType() {
        return doorType;
    }
}
