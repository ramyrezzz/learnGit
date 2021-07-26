package ro.fasttrackit.assignments.tomi.OOPcurs.LAB14;

import ro.fasttrackit.assignments.tomi.OOPcurs.Interface.PersonWithInterface;

public class MainPersonWithInterface {
    public static void main(String[] args) {
        PersonWithInterface firstperson = new PersonWithInterface("Viorel");
        firstperson.eat("Salad",false);
        firstperson.drink("Whiskey");

        firstperson.isFull();
        firstperson.eat();
        firstperson.drink();


    }
}
