package ro.fasttrackit.raluca.person;

public class Person {
    private final String name;
    private boolean full = false;

    public Person(String name){
        this.name = name;
    }
    public String name(){
        return name;
    }
    public void isFull(){
        System.out.printf("%s is full: %s%n", name, full);
    }


    public void eat(){
        full = true;
        System.out.printf("Person %s eats %n", name);
        isFull();
    }
    public void eat(String food){
        full = true;
        System.out.printf("Person %s eats %s %n",name, food);
        isFull();
    }

    public void run(){
        System.out.printf("Person %s exercises.%n", name);
    }

    public void drink(){
        eat();
    }
}
