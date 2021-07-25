package ro.fasttrackit.mela.thirdperson;

public class MainThird {
    public static void main(String[] args) {
        ThirdPerson obj1 = new ThirdPerson("Popescu Ileana", 34, 1.62);
        ThirdStudent obj2 = new ThirdStudent(
                "Ionescu George",
                21,
                1.75,
                9.50,
                "ETL");
        ThirdEmployee obj3 = new ThirdEmployee(
                "Gergescu Marian",
                25,
                1.82,
                "Telekom",
                2233,
                1500
        );
        obj1.sePrezinta();;
        System.out.println("--------------------");
        obj2.sePrezinta();
        System.out.println("--------------------");
        obj2.sePrezinta("Hello");
        obj2.speakLanguage("English");
        obj2.programingLanguage("Java");
        System.out.println("--------------------");
        obj3.sePrezinta();;
        obj3.speakLanguage("French");
        obj3.programingLanguage("PL/SQL");
        obj3.drive();
        obj3.teamlead();
    }
}
