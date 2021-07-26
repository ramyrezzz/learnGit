package ro.fasttrackit.furniture;

public class Chair extends Furniture {

    private final boolean armRest;
    private final boolean forDesk;
    private final boolean headRest;

    public Chair(String color, String material, double height, double width, boolean armRest, boolean forDesk, boolean headRest) {
        super(color, material);
        this.armRest = armRest;
        this.headRest = headRest;
        this.forDesk = forDesk;
        super.setHeight(height);
        super.setWidth(width);
    }

    public Chair(Furniture furniture, boolean armRest, boolean headRest, boolean forDesk, double height, double width) {
        super(furniture.getColor(), furniture.getMaterial());
        this.armRest = armRest;
        this.forDesk = forDesk;
        this.headRest = headRest;
        this.setHeight(height);
        this.setWidth(width);
    }

    public boolean isHeadRest() {
        return headRest;
    }
    public boolean isForDesk(){
        return forDesk;
    }

}

