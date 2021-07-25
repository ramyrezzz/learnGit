package ro.fasttrackit.mela.oop;

public abstract class Survival implements Feedable{
    public void eat()
    {
        System.out.println("I Can Eat!");
      //  System.out.println(this.getClass().getName() + " I Can Eats"); //also displays the package name
      //  System.out.println(this.getClass().getSimpleName() + " I Can Eats"); //not displays the package name
    }

    public void run()
    {
        System.out.println("I Can Run!");
      //  System.out.println(this.getClass().getSimpleName()+" I Can Run!");
    }
    public void drink()
    {
        System.out.println("I Need to Drink");
    }
    public abstract void scream();
}
