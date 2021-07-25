package ro.fasttrackit.assignments.tomi.OOPcurs.PERSONobject;

public class MainPersonWithInterface {
    public static void main(String[] args) {
        PersonWithInterface firstperson = new PersonWithInterface("Viorel");
        firstperson.eat("Salad",false);

        firstperson.isFull();
        firstperson.eat();
        firstperson.drink();


    }
}
