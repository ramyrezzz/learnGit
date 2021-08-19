package ro.fasttrackit.oop.person;

public abstract class Survival implements Feedable {
    public void eat() {
        System.out.println("I can Eat !");
    }

    public void run() {
        System.out.println("I can Run!");
    }

    public void drink() {
        System.out.println("I need to drink !");
    }

    public abstract void scream();
}
