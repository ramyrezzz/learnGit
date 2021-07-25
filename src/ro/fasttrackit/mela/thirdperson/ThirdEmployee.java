package ro.fasttrackit.mela.thirdperson;

public class ThirdEmployee extends ThirdPerson {
    private String company;
    private int mark;
    private double salary;

    public ThirdEmployee() {
        super();
        this.company = null;
        this.mark = 0;
        this.salary = 0.0;
    }

    public ThirdEmployee(String name, int age, double height, String company, int mark, double salary) {
        super(name, age, height);
        this.company = company;
        this.mark = mark;
        this.salary = salary;
    }
    public String getCompany() {
        return company;
    }
    public int getMark() {
        return mark;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void sePrezinta() {
        super.sePrezinta();
        System.out.printf("I am employed by the company : %s%n",getCompany());
        System.out.printf("I have a brand : %s%n", getMark());
    }

}