package ro.fasttrackit.RaulToolsBox.WorkingOn;

public class Animal extends Survival implements Feedable {

    private boolean isFool = false;
    public final String name;

    public Animal(String name) {
        this.name = name;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public void eat(String food) {
        System.out.printf("Animal eats: %s %n ", food);

    }
    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Animal eats: %s %n ", food);
        System.out.printf("Animal is Full:%s %n ", isFull);
        this.isFool = isFull;

    }

    @Override
    public void drink(String liquid) {
    }
}
