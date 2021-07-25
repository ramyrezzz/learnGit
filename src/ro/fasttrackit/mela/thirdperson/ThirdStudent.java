package ro.fasttrackit.mela.thirdperson;

public class ThirdStudent extends ThirdPerson {
    private double averageGrades;
    private String college;

    public ThirdStudent() {
        super();
        this.averageGrades = 0.0;
        this.college = null;
    }

    public ThirdStudent(String name, int age, double height, double averageGrades, String college) {
        super(name, age, height);
        this.averageGrades = averageGrades;
        this.college = college;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public String getCollege() {
        return college;
    }

    @Override
    public void sePrezinta() {
        super.sePrezinta();
        System.out.printf("I'm a college student : %s and I have the media : %s%n", getCollege(), getAverageGrades());
    }
   public void sePrezinta (String Hello){
       System.out.printf("%s!%n", Hello);
       this.sePrezinta();
       System.out.printf("I'm %s years old %n", getAge());
   }
}

