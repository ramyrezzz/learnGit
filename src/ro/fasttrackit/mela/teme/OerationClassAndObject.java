package ro.fasttrackit.mela.teme;
class Student {
    int identifier;
    double averageGrades;
    String studentName;
}

public class OerationClassAndObject {
    public static void main(String[] args) {
        PersonTwo person2 = new PersonTwo("Ana", 25, 203, "ETL", true,
                "English", "dogs");
        PersonTwo person3 = new PersonTwo("Lili", 34, 0, null, false,
                "French", "cat");
        if (person2.getName() == null || person2.getAge() == 0)
        {
            System.out.println("Please enter the valid arguments for defined objects!");
            return;
        }
        person2.aboutMe();
        person2.isEmployee();
        person2.isStudent();
        person2.isUnemployee();
        person2.isStudentEmployee();
        person2.isDriver();
        person2.speakLanguage();
        person2.havePets();
        System.out.println();

        if (person3.getName() == null || person2.getAge() == 0)
        {
            System.out.println("Please enter the valid arguments!");
            return;
        }
        person3.aboutMe();
        person3.isEmployee();
        person3.isStudent();
        person3.isUnemployee();
        person3.isStudentEmployee();
        person3.isDriver();
        person3.speakLanguage();
        person3.havePets();

        System.out.println("-------------------------------------------------------------------");

        Student s1 = new Student();
        Student s2 = new Student();
        s1.identifier = 101;
        s1.averageGrades = 9.55;
        s1.studentName = "Popescu Ionel";
        s2.identifier = 102;
        s2.averageGrades = 8.82;
        s2.studentName = "Ionescu Mihai";
        System.out.println(s1.identifier + " "+ s1.averageGrades+" "+s1.studentName);
        System.out.println(s2.identifier + " "+ s2.averageGrades+" "+s2.studentName);
    }
}
