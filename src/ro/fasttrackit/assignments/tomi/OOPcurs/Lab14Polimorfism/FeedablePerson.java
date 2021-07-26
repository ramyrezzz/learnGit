package ro.fasttrackit.assignments.tomi.OOPcurs.Lab14Polimorfism;


public class FeedablePerson implements Feedable {

    private final String name;
    protected boolean full = false;

    public FeedablePerson(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isFull(){
        System.out.println("Person " + name + " is full " + this.full);
        return full;
    }

    @Override
    public void eat() {
        System.out.println("Person " + name + " eats !");
    }

    @Override
    public void eat(String food){
        System.out.println("Person eats " + food);
    }

    @Override
    public void drink() {
        System.out.println("Person drinks !");
    }

    @Override
    public void drink(String liquid) {
        System.out.println("Person " + name + " drink " + liquid);
    }

    @Override
    public void eat(String food, boolean isFull) {
        System.out.println("Person " + name + " eats " + food);
        System.out.println("Person who is full " + name + " : " + isFull);
    }

    @Override
    public void run() {
        System.out.println(name + " person runs ! ");
    }
}
