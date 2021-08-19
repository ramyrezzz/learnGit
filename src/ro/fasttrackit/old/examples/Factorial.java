package ro.fasttrackit.old.examples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        firstFactorialProblem(args);
        secondFactorialProblem(args);
        thirdFactorialProblem(args);
        forthFactorialProblem(args);
        fifthFactorialProblem(args);
        sixthFactorialProblem(args);
    }

    private static void sixthFactorialProblem(String[] args) {
        int firstArgs = 4;
        int fact = 1;
        int f;
        for (f = 1; f <= firstArgs; f++) {
            fact = fact * f;
        }
        System.out.println("\n Factorial number is:" + fact);
    }

    private static void fifthFactorialProblem(String[] args) {
        if (args.length == 0) {
            System.out.println("Numar insuficient de argumente : " + args.length);
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print("Factorial de " + args[i] + " (" + args[i] + "!) = ");
            //  int a = Integer.parseInt(args[i]);
            int numarFactorial = 1;
            for (int k = 1; k <= Integer.parseInt(args[i]); k++) {
                numarFactorial *= k;
                System.out.print(k + "*");
            }
            System.out.print("=" + numarFactorial);
            System.out.println();
        }
    }

    private static void forthFactorialProblem(String[] args) {
        System.out.println("firstNumber " + args[0]);
        System.out.println("secondNumber " + args[1]);
        System.out.println("thirdNumber " + args[2]);
        System.out.println("fourthNumber " + args[3]);

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);
        int fourthNumber = Integer.parseInt(args[3]);

        int[] firstNumArray = new int[firstNumber];
        int[] secondNumArray = new int[secondNumber];
        int[] thirdNumArray = new int[thirdNumber];
        int[] fourthNumArray = new int[fourthNumber];

        int firstNumFaktor = 1;
        int a;
        for (a = 1; a <= firstNumArray.length; a++) {
            System.out.println(a);
            firstNumFaktor = a * firstNumFaktor;
            System.out.println("faktor = " + firstNumFaktor);
        }
        System.out.println();
        int secondNumFaktor = 1;
        int b;
        for (b = 1; b <= secondNumArray.length; b++) {
            System.out.println(b);
            secondNumFaktor = b * secondNumFaktor;
            System.out.println("factor = " + secondNumFaktor);
        }
        System.out.println();
        int thirdNumFaktor = 1;
        int c;
        for (c = 1; c <= thirdNumArray.length; c++) {
            System.out.println(c);
            thirdNumFaktor = c * thirdNumFaktor;
            System.out.println("factor = " + thirdNumFaktor);
        }
        System.out.println();
        int fourthNumFaktor = 1;
        int d;
        for (d = 1; d <= fourthNumArray.length; d++) {
            System.out.println(d);
            fourthNumFaktor = d * fourthNumFaktor;
            System.out.println("factor = " + fourthNumFaktor);
        }
    }

    private static void thirdFactorialProblem(String[] args) {
        int fact = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();

        if (n < 0) {
            System.out.println("Factorial number of a negative number doesn\'t exist");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of:" + n + " is:" + fact);
        }
        return;


    }

    private static void secondFactorialProblem(String[] args) {
        System.out.println("First args is: " + args[0]);
        int a = Integer.parseInt(args[0]);
        double fact = fact(Integer.parseInt(args[0]));
        System.out.println("The Factorial of " + args[0] + " is " + fact);
    }

    private static void firstFactorialProblem(String[] args) {
        if (args.length != 1) {
            System.out.println(" Only one Variable required. ");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.print("\n Factorial of " + n + " is: ");
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }

    public static Double fact(int a) {
        double fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
