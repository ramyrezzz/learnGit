package ro.fasttrackit.andreea.person;

public class MainPerson {

    public static void main(String[] args) {
        FeedablePerson person = new FeedablePerson("Andreea");
        Person firstPerson = new Person("Dorel");
        //person.isFull();
        //person.run();
        //person.eat();

        //firstPerson.eat("salad");
        // firstPerson.eat("salad", false);
        person.eat("salad",false);
    }
}
