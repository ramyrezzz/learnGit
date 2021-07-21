package ro.fasttrackit.person;

public class Animal implements Feedable{

    private boolean isFool = false;

    @Override
    public void eat() {
        System.out.println("Animal Eats !");
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
    public void drink() {
        System.out.println("Animal Drinks !");
    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Animal drinks: %s%n", liquid);
    }

    @Override
    public void run() {
        System.out.println("Animal Runs !");
    }
}
