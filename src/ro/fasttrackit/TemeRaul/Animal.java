package ro.fasttrackit.TemeRaul;

public class Animal implements Feedable {

    private boolean isFool = false;

    @Override
    public void eat() {
        System.out.println("Animal Eats.");
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
    public void drink() {
        System.out.println("Animal drinks");
    }
    @Override
    public void drink(String liquid) {
    }
    @Override
    public void run() {
    }
}
