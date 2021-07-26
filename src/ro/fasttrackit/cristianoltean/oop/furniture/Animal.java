package ro.fasttrackit.cristianoltean.oop.furniture;

public class Animal extends Survival implements Feedable{
    private boolean isFool = false;
    private final String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void drink(String liquid) { System.out.printf("Animal drinks: %s%n", liquid);

    }

    @Override
    public void eat(String food) {
        System.out.printf("Animal eats: %s%n", food);
    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Animal eats: %s%n", food);
        System.out.printf("Animal is full: %s%n", isFull);
        this.isFool = isFull;
    }

    @Override
    public void scream() {
        System.out.println("Animal Screams!");
    }
}
