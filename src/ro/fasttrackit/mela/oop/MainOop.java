package ro.fasttrackit.mela.oop;

public class MainOop {
    public static void main(String[] args) {
        PersonWithInterface firstPerson = new PersonWithInterface("Mela");
        PersonWithInterface secondPerson = new PersonWithInterface("Zoia");
        firstPerson.eat("Salade", false);
        firstPerson.drink("Water");
        firstPerson.eat("Meat");
        secondPerson.eat();
        secondPerson.drink();
        secondPerson.run();
        secondPerson.run("in the Sports Base");
    }
}
