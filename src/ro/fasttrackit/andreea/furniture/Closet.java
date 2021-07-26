package ro.fasttrackit.andreea.furniture;

public class Closet extends Furniture{

    public final int doorCount;
    public final String doorType;

    public Closet(String color, String material, double witgh, double hight, boolean forDesk, int doorCount, String doorType) {
        super(color, material);
        this.doorCount = doorCount;
        this.doorType = doorType;
        setHeight(hight);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public String getDoorType() {
        return doorType;
    }

}
