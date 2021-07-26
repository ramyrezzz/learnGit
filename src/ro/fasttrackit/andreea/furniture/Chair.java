package ro.fasttrackit.andreea.furniture;

public class Chair extends Furniture{
    private final boolean armRest;
    private final boolean headRest;
    private final boolean forDesk;


    public Chair(String color, String material, double witgh, double hight, boolean armRest, boolean headRest, boolean forDesk) {
        super(color, material);
        this.armRest = armRest;
        this.headRest = headRest;
        this.forDesk = forDesk;
        super.setHeight(hight);
        super.setWidth(witgh);
    }

    public Chair(Furniture furniture, boolean armRest, boolean headRest, boolean forDesk, double pieceHigth, double width) {
        super(furniture.getColor(), furniture.getMaterial());
        this.armRest = armRest;
        this.headRest = headRest;
        this.forDesk = forDesk;
        this.height = pieceHigth;
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
