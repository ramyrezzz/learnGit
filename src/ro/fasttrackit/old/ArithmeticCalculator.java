package ro.fasttrackit.old;

public class ArithmeticCalculator {
    public static void main(String[] args){
        if (args.length ==3) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            double result;
            String operator = args[1];
            // implement calculator logic here
            switch(operator) {
                case "+":
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;

                case "-":
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;

                case "*":
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;

                case "/":
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                    break;

                default:
                    System.out.println("Error! operator is not correct");
                    break;
            }
        }
        else {
            System.err.println("3args are needed!");
        }
    }
}
