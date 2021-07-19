package ro.fasttrackit.furniture;

public class Chair extends myFurniture{
    private final boolean armRest;


    public Chair(String color,
                 String material,
                 double height,
                 double width,
                 boolean armRest,
                 boolean forDesk)
    {
        super(color, material, height, width, armRest, forDesk);
        this.armRest
    }
}
