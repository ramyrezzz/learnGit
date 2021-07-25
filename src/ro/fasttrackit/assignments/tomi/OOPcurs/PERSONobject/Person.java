package ro.fasttrackit.assignments.tomi.OOPcurs.PERSONobject;

public class Person {
    private final String name ;
    private boolean full = false;

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
    public void isFull(){
        System.out.println("The person " + name + " is full : " + full);
    }

    public void eat(){
        full = true;
        System.out.println("Person " + name + " eats !");
        isFull();
    }
    public void eat(String food){
        full = true;
        System.out.println("Person eats " + food);
        isFull();
    }
    public String eat(String food, boolean isFull){
        full = isFull;
        System.out.println("Person " + name + " eats a " + food);
        isFull();
        return food;
    }


    public void run(){
        System.out.println("Person " + name + " exercises!");
    }
    public void drink(){
        eat();
    }
}

