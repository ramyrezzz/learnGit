package ro.fasttrackit;

public abstract class Animal implements Feedable{
    private boolean isFull = false;

    @Override
    public void eat() {
        System.out.println("Animal eats!");
    }

    @Override
    public void eat(String food) {
        System.out.printf("Animal eats: %s  %n", food);

    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.printf("Animal eats: %s %n" , food);
        System.out.printf("Animal is full: %s", isFull);


    }

    @Override
    public void drink(String drink) {

    }


}
