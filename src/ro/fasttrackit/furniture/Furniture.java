package ro.fasttrackit.furniture;

public class Furniture {
    private final String color;
    private final String material;
    private double height;
    private double width;

    public Furniture(String color, String material) {
        this.color = color;
        this.material = material;


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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public boolean isForDesk() {
        return false;
    }

}
