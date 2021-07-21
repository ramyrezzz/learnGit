package ro.fasttrackit.mela.furniture;

public class Closet extends Furniture{
    private final int doorCount;
    private final String doorType;
    public Closet(String color, String material, double height, int doorCount, String doorType) {
        super(color, material);
        this.doorCount = doorCount;
        this.doorType = doorType;
        setHeight(height);
    }
    public int getDoorCount() {
        return doorCount;
    }

    public String getDoorType() {
        return doorType;
    }

}
