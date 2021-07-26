package ro.fasttrackit.assignments.tomi.OOPcurs.LAB14;

import ro.fasttrackit.assignments.tomi.OOPcurs.Interface.Feedable;

public class PersonWithInterface implements Feedable {

    private final String name;
    private boolean full = false;

    public PersonWithInterface(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isFull(){
        System.out.println("Person " + name + " is full " + full);
        return full;
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void drink(String liquid) {
        System.out.println("Person " + name + " drink " + liquid);

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.println("Person " + name + " eats " + food);
        this.full = isFull;



    }

    @Override
    public void run() {

    }
}
