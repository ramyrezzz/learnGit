package ro.fasttrackit.assignments.tomi.OOPcurs.ABSTRACTclass;

import ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism.Feedable;

public class Animal extends Survival implements Feedable {
    private boolean isFull = false;

    @Override
    public void eat() {
        System.out.println("Animal eats ! ");
    }

    @Override
    public void eat(String food) {
    }


    @Override
    public void eat(String food, boolean isFull) {
        System.out.println("Animal eats : " + food );
        System.out.println("Animal is full : " + isFull);
        this.isFull = isFull;

    }

    @Override
    public void drink() {
        System.out.println("Animal drinks ");

    }

    @Override
    public void drink(String liquid) {
        System.out.println("Animal drinks : " + liquid);

    }

    @Override
    public void run() {
        System.out.println("Animal runs ");

    }
}
