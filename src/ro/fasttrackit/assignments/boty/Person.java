package ro.fasttrackit.assignments.boty;

import java.util.Scanner;

public class Person {
    private final String name;
    private boolean full = false;
    boolean eat;


    public Person(String name) {
        this.name = name;
    }

    public String name() {

        return name;
    }

    public void isFull() {

        System.out.printf("%s is full: %s%n", name, full);
    }

    public void eat() {

        System.out.printf("Did person %s eat? Answer with true or false", name);
        Scanner didHeEat = new Scanner(System.in);
        boolean eat = didHeEat.nextBoolean();
        full = !eat;
        run();
    }

    public void run() {
        if (!full) {
            System.out.printf("Person %s can not run.%n", name);
            eat();
            return;
        }

        System.out.printf("Person %s CAN run.%n", name);
    }

    public void drink() {
        eat();
    }
}
