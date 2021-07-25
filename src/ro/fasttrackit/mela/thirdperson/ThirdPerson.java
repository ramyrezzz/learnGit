package ro.fasttrackit.mela.thirdperson;

public class ThirdPerson implements Skillable{
    private String name;
    private int age;
    private double height;

    public ThirdPerson() {
       this("Necunoscut", 0, 0.0);
    }
    public ThirdPerson(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public ThirdPerson(String name) {
        this(name,0, 0.0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void sePrezinta(){
        System.out.printf("My name is %s%n", getName());
    }

    @Override
    public void speakLanguage(String language) {
        System.out.printf("I speak : %s%n", language);
    }

    @Override
    public void programingLanguage(String code) {
        System.out.printf("I know programing language : %s%n", code);
    }

    @Override
    public void drive() {
        System.out.printf("I am driving%n");
    }

    @Override
    public void teamlead(){
        System.out.println("I'm the leader of the team");
    }
}
