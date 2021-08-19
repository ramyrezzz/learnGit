package ro.fasttrackit.mela.teme;

public class PersonTwo {
    private String name;
    private int age;
    private int markEmployee;
    private String college;
    private boolean hasCar;
    private String language;
    private String pets;

    public PersonTwo(String name, int age, int markEmployee, String college, boolean hasCar, String language,
                     String pets) {
        this.name = name;
        this.age = age;
        this.markEmployee = markEmployee;
        this.college = college;
        this.hasCar = hasCar;
        this.language = language;
        this.pets = pets;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getmarkEmployee() {
        return markEmployee;
    }

    public String getcollege() {
        return college;
    }

    public void aboutMe() {
        System.out.printf("My name is %s.%n", name);
        System.out.printf("I am %s years old.%n", age);
    }

    public void isEmployee() {
        if (markEmployee != 0 && college == null)
            System.out.println("I am an employee with the brand:" + markEmployee);
    }

    public void isStudent() {
        if (markEmployee == 0 && college != null)
            System.out.println("I'm a college student :" + college);
    }

    public void isUnemployee() {
        if (markEmployee == 0 && college == null)
            System.out.println("I'm unemployed.I'm looking for a job.");
    }

    public void isStudentEmployee() {
        if (markEmployee != 0 && college != null)
            System.out.println("I am a student college " + college +
                    " and I am already employed with the brand " + markEmployee + ".");
    }

    public void isDriver() {
        if (age >= 18 && hasCar)
            System.out.println("I have a car and I drive.");
    }

    public void speakLanguage() {
        if (language != null)
            System.out.println("I speak " + language + ".");
    }

    public void havePets() {
        if (pets != null)
            System.out.println("I have pets: " + pets + ".");
    }
}

