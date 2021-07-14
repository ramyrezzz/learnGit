package ro.fasttrackit;

public class DivideWith0 {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("not enough numbers to calculate.");
            return;
        }
        if ((args[0] != "0") || (args[1] != "0") || (args[2] != "0")) {
            System.out.println("Numbers need to be greater than 0.");
            return;
        }
        System.out.println("1st arg:" + args[0]);
        System.out.println("2st arg:" + args[1]);
        System.out.println("3st arg:" + args[2]);


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int sum = a + b;
        int prod = a * b;
        int division = prod / c;

        String nameOfCalculator = "Digit Calculator";

        System.out.printf("%s: %nSum is: %d and prod is: %d%n", nameOfCalculator, sum, prod);
        System.out.println(nameOfCalculator + "\n" + "Sum is: " + sum + " and prod is: " + prod);
    }
}
