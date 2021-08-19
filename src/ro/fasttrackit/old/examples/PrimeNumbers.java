package ro.fasttrackit.old.examples;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        firstPrimeNumbersProblem(args);
        secondPrimeNumbersProblem(args);
        thirdPrimeNumbersProblem(args);
        fourthPrimeNumbersProblem(args);
        fifthPrimeNumbersProblem(args);
    }

    private static void fifthPrimeNumbersProblem(String[] args) {
        int nrIntrare;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numar pana la care doriti sa calculati numerele prime : ");
        nrIntrare = input.nextInt();
        int nrPrim = 0;
        int j = 1;
        System.out.println("Toate numere prime existente pana la numarul " + nrIntrare + " sunt : ");
        while (j <= nrIntrare) {
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    nrPrim = 1;
                }
            }
            if (nrPrim == 0) {
                System.out.print(j + " ");
            }
            // else {
            //    System.out.println("Numarul : "+j+" nu este numar prim");
            //}
            j++;
            nrPrim = 0;
        }
    }

    private static void fourthPrimeNumbersProblem(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();
        int prime;

        System.out.println("Your numbers are: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 0)
                continue;

            prime = 1;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1) {
                System.out.println(i + "");
            }

        }


    }

    private static void thirdPrimeNumbersProblem(String[] args) {
        //prime numbers
        int number = 5;
        int i, count;
        System.out.println("\nPrime Numbers from 1 to" + number + "13 are : ");
        for (number = 1; number <= 13; number++) {
            count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
            }
        }
    }

    private static void secondPrimeNumbersProblem(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

    private static void firstPrimeNumbersProblem(String[] args) {
        System.out.println();
        //Print all prime numbers until a certain given numberAssignment
        int numberString[] = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        int n = numberString.length;

        int i, m = 0, flag = 0;
        int p = 9;//it is the number to be checked
        m = p / 2;
        if (p == 0 || p == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (p % i == 0) {
                    System.out.println(p + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(p + " is prime number");
            }
        }
    }
}
