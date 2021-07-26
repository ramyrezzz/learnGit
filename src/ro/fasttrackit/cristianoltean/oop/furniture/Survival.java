package ro.fasttrackit.cristianoltean.oop.furniture;

public abstract class Survival implements Feedable {
    public void eat() {
        System.out.println("I can eat !");
    }
    public void run() {

        System.out.println("I can run!");
    }
    public void drink() {
        System.out.println("I need to drink!");
    }
    public abstract void scream();
}
