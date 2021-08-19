package ro.fasttrackit.cristianoltean.oop.furniture;

public class Person {
    private String name;
    private boolean full = false;
    private boolean fit = false;

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
        full = true;
        System.out.printf("Person %s eats.%n", name);
        isFull();
    }

    public void eat(String food) {
        full = true;
        System.out.printf("Person %s eats %s.%n", name, food);
        isFull();
    }

    public String eat(String food, boolean isFull) {
        full = isFull;
        System.out.printf("Person %s eats %s.%n", name, food);
        isFull();
        return food;
    }

    public void run() {
        System.out.printf("Person %s exercises.%n", name);
    }

    public void dance() {
        fit = false;
        System.out.printf("Person %s is dancing to lose weight.%n", name);
        isFull();
    }

    public void tired() {
        full = true;
        System.out.printf("Person %s is tired because is full. %n", name);
        isFull();
    }
}
