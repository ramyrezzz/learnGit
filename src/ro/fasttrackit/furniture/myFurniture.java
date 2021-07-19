package ro.fasttrackit.furniture;

public class myFurniture {
    private final String color;
    private final String material;
    private final double height;
    private final double width;
    private final boolean forDesk;

    public myFurniture(String color, String material, double height, double width, boolean armRest, boolean forDesk) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.forDesk = forDesk;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isArmRest() {
        return armRest;
    }

    public boolean isForDesk() {
        return forDesk;
    }
}
