package ro.fasttrackit.assignments.tomi;

import ro.fasttrackit.assignments.tomi.TemaPerson;

public class TemaPerson1 {
    public static void main(String[] args) {
        TemaPerson Tamaska = new TemaPerson();
        Tamaska.getMyName();
        Tamaska.getMyAge();
        Tamaska.myHeight();
        Tamaska.getMyWeight();
        Tamaska.getMyInitials();
        Tamaska.married();
        Tamaska.myGender();
        Tamaska.myimc();

        System.out.println("My name is : " + Tamaska.getMyName());
        System.out.println(Tamaska.getMyInitials());
        System.out.println("My gender is : " + Tamaska.myGender());
        System.out.println("I am married ? " + Tamaska.married());
        System.out.println("My age is : " + Tamaska.getMyAge() + " years");
        System.out.println("My height is : " + Tamaska.myHeight() + " cm");
        System.out.println("My weight is : " + Tamaska.getMyWeight() + " kg");
    }
}

