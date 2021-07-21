package ro.fasttrackit.cristianoltean.oop.furniture;

public class Chair extends Furniture {
    private final boolean armRest;
    private final boolean headRest;
    private final boolean forDesk;

       public Chair(String color, String material, double height, double width, boolean armRest, boolean headRest, boolean forDesk) {
        super(color, material);
        this.armRest = armRest;
        this.forDesk = headRest;
        this.headRest = forDesk;
    }

    public Chair(Furniture furniture, boolean armRest, boolean headRest, boolean forDesk, double pieceHeight, double width) {
        super(furniture.getColor(), furniture.getMaterial());
        this.armRest = armRest;
        this.headRest = headRest;
        this.forDesk = forDesk;
        this.height = pieceHeight;
        this.setWidth(width);
    }

    public boolean isArmRest() {
        return armRest;
    }

    public boolean isHeadRest() {
        return headRest;
    }

    public boolean isForDesk() {
           return forDesk;
    }
}
