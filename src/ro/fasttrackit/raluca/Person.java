package ro.fasttrackit.raluca;

public class Person {
    private final String name;
    private boolean full = false;
    private boolean tired = false;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void isFull() {
        System.out.printf("%s is full: %s%n", name, full);
    }

    public void eat() {
        full = true;
        System.out.printf("Person %s eats.%n", name);
        isFull();
    }

    public void isTired() {
        System.out.printf("%s is tired: %s%n", name, tired);
    }

    public void run() {
        tired = true;
        System.out.printf("Person %s exercises.%n", name);
        isTired();
    }

    public void drink() {
        eat();
    }

    public void work() {
        tired = true;
        System.out.printf("%s is working.%n", name);
        isTired();
    }

    public void read() {
        System.out.printf("%s is reading.%n", name);
    }
}
