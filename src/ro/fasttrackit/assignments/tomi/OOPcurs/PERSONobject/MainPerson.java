package ro.fasttrackit.assignments.tomi.OOPcurs.PERSONobject;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Viorel");
        person.eat("Salad", false);

        person.isFull();
        person.eat();
        person.drink();
        person.run();
        String name = person.name();
        System.out.println(name);
    }
}


