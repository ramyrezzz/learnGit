package ro.fasttrackit.old.examples;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        firstEvenNumersProblem(args);
        secondEvenNumbersProblem(args);
        thirdEvenNumbersProblem(args);
        forthEvenNumbersProblem(args);
        fifthEvenNumbersProblem(args);
        sixthEvenNumbersProblem(args);
        seventhEvenNumbersProblem(args);
    }

    private static void seventhEvenNumbersProblem(String[] args) {
        int n = 100;
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void sixthEvenNumbersProblem(String[] args) {
        int number = 100;
        System.out.print("Even Numbers from 1 to " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void fifthEvenNumbersProblem(String[] args) {
        //Verify that the input coming into your application is different than 0Assignment
        int firstArgs = 4;
        int secondArgs = 4;
        int thirdArgs = 0;
        //int z=0;

        int numberString[] = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        System.out.print("This is our string : ");
        for (int i = 0; i < numberString.length; i++) {
            System.out.print(numberString[i] + ", ");
        }
        System.out.println();

        int n = numberString.length;
        System.out.print("\n even number: ");
        for (int i = 0; i < n; i++) {
            if (numberString[i] % 2 == 0)
                System.out.print(numberString[i] + ",");
        }
        System.out.println();

        System.out.print("\n odd numbers: ");
        for (int i = 0; i < n; i++) {
            if (numberString[i] % 2 == 1)
                System.out.print(numberString[i] + ",");
        }
        System.out.println();
    }

    private static void forthEvenNumbersProblem(String[] args) {
        //even numbers
        int n = 5;
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void thirdEvenNumbersProblem(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();

        System.out.println("Your numbers are: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    private static void secondEvenNumbersProblem(String[] args) {

        System.out.println("first number " + args[0]);
        System.out.println("second number " + args[1]);
        System.out.println("third number " + args[2]);

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        int a;
        for (a = 0; a <= first; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        System.out.println();
        int b;
        for (b = 0; b <= second; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
        System.out.println();
        int c;
        for (c = 0; c <= third; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }
    }

    private static void firstEvenNumersProblem(String[] args) {

        int[] nrPare = {5, 9, 20};

        for (int i = 0; i < nrPare.length; i++) {
            System.out.print("Toate numerele mai mici decat nr " + nrPare[i] + " sunt : ");
            for (int k = 0; k < nrPare[i]; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        ;

        for (int i = 0; i < nrPare.length; i++) {
            System.out.print("Numerele PARE mai mici decat nr " + nrPare[i] + " sunt : ");
            for (int k = 0; k < nrPare[i]; k++) {
                if (k % 2 == 0) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }

    }
}
