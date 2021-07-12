/**
 * Author : Tusa Letitia-Melania
 * Implement an arithmetic calculator that takes 3 arguments: the first number,
 * the operation, the second number
 * The arguments entered are assumed to be valid
 * The validation part of the arguments was not done here
 */
package ro.fasttrackit.mela.teme;

public class OperationArithmeticCalculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Numar insuficient de argumente : " + args.length);
            return;
        }
        if (args.length == 3) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            String operator = args[1];
            if (operator.equals("+")) {
                System.out.println("The chosen operator is Addition:");
                System.out.print(a + " " + operator + " " + b + " = " + (a + b));
                return;
            }
            if (operator.equals("-")) {
                System.out.println("The chosen operator is Subtraction:");
                System.out.print(a + " " + operator + " " + b + " = " + (a - b));
                return;
            }
            if (operator.equals("*")) {
                System.out.println("The chosen operator is Multiplication:");
                System.out.print(a + " " + operator + " " + b + " = " + (a * b));
                return;
            }
            if (operator.equals("/")) {
                System.out.println("The chosen operator is Dividen:");
                System.out.print(a + " " + operator + " " + b + " = " + (a / b));
                return;
            }
            if (operator.equals("%")) {
                System.out.println("The chosen operator is Remainder:");
                System.out.print(a + " " + operator + " " + b + " = " + (a % b));
                return;
            }
            // implement calculator logic here
            // System.out.println("Resultis: " + result);
        }
    }
}