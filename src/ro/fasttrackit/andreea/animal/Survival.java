package ro.fasttrackit.andreea.animal;

public abstract class Survival {

    public void eat(){
       // System.out.println(this.getClass().getSimpleName() + " I can eat");
        System.out.println("I can eat!");
    }

    public void run() {
        System.out.println("I can run!");
    }

    public void drink() {
        System.out.println("I need to drink!");
    }

    public abstract void scream();
}
