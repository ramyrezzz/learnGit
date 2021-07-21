package ro.fasttrackit.TemeValerian;

public class Person {
    private final String name;
    private boolean full = false;
    public Person(String name){
        this.name = name;
    }
    public String name(){return name;}
    public void isFull(){
        System.out.printf("%s is full: %s%n",name, full);
    }
    public void eat(){
        System.out.printf("Person %s eats.%n", name);
        isFull();
    }
}
