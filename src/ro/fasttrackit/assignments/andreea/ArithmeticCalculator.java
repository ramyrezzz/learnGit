package ro.fasttrackit.assignments.andreea;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        if (args.length == 3) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            String[] operator = {"+", "-", "*", "/"};
            double result = 0;
            for (int i = 0; i < operator.length; i++) {
                if (operator[i] == "+") {
                    result = a + b;
                    System.out.println("Result is: " + result);
                }
                if (operator[i] == "-") {
                    result = a - b;
                    System.out.println("Result is: " + result);
                }
                if (operator[i] == "*") {
                    result = a * b;
                    System.out.println("Result is: " + result);
                }
                if (operator[i] == "/") {
                    result = a / b;
                    System.out.println("Result is: " + result);
                }
            }
        } else {
            System.err.println("3 args are needed!");
        }
    }
}