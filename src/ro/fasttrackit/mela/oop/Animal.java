package ro.fasttrackit.mela.oop;

public class Animal extends Survival implements Feedable{
    private boolean isfull = false;

//    @Override
//    public void eat() {
//        System.out.printf("Animal eats%n");
//    }

    @Override
    public void eat(String food) {
        System.out.printf("Animal eats: %s%n", food);

    }

    @Override
    public void eat(String food, boolean isfull) {
        System.out.printf("Animal eats: %s%n", food);
        System.out.printf("Animal is full: %s%n", isfull);
        this.isfull = isfull;
    }
//
//    @Override
//    public void drink() {
//        System.out.printf("Animal drinks%n");
//    }

    @Override
    public void drink(String liquid) {
        System.out.printf("Animal drinks : %s%n", liquid);
    }

//    @Override
//    public void run() {
//
//    }

    @Override
    public void run(String location) {

    }
}
