package ro.fasttrackit.assignments.tomi.OOPcurs.MostenireObjectDeLaObject;

public class Chair extends Furniture {
    private final boolean armRest;
    private final boolean headRest;

    public Chair(String color, String material, double height, double width, boolean forDesk, boolean armRest, boolean headRest) {
        super(color, material, height, width, forDesk);
        this.armRest = armRest;
        this.headRest = headRest;

    }
    public boolean isArmRest() {
        return armRest;
    }
    public boolean isHeadRest() {
        return headRest;
    }
}

