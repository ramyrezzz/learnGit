package ro.fasttrackit.cristianoltean;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("3 args are needed!");
            return;
        }
        double firstNr = Double.parseDouble(args[0]);
        double secondNr = Double.parseDouble(args[2]);
        String operation = args[1];
        makeCalculations(firstNr, secondNr, operation);
    }

    private static void makeCalculations(double a, double b, String operator) {
        if (isAddition(operator))
            System.out.println("Result is: " + a + b);
        if (isSubtraction(operator))
            System.out.println("Result is: " + (a - b));
        if (isMultiplication(operator))
            System.out.println("Result is: " + a * b);
        if (isDivision(operator))
            System.out.println("Result is: " + a / b);
    }

    private static boolean isDivision(String operator) {
        return operator.equals("/");
    }

    private static boolean isMultiplication(String operator) {
        return operator.equals("*");
    }

    private static boolean isSubtraction(String operator) {
        return operator.equals("-");
    }

    private static boolean isAddition(String operator) {
        return operator.equals("+");
    }
}


