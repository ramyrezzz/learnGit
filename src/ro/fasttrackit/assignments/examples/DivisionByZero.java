package ro.fasttrackit.assignments.examples;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        firstDivisionByZeroProblem(args);
        secondDivisionByZeroProblem(args);
        thirdDivisionByZeroProblem(args);
        fourthDivisionByZeroProblem(args);
        fourthDivisionbyZeroProblem(args);
        fifthDivisionByZeroProblem(args);
        sixthDivisionByZeroProblem(args);
    }

    private static void sixthDivisionByZeroProblem(String[] args) {

        //Verify that the input coming into your application is different than 0Assignment
        int firstArgs = 4;
        int secondArgs = 4;
        int thirdArgs = 0;
        //int z=0;

        if (thirdArgs != 0) {
            float division = secondArgs / thirdArgs;
            System.out.println(division);
        } else {
            System.out.println("\nDivision cannot be executed");
        }
        //Verify that the input coming into your application is different than 0Assignment
    }

    private static void fifthDivisionByZeroProblem(String[] args) {
        int input = 0;
        System.out.println("Enter an Integer value ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            input = sc.nextInt();
            if(input>0)
                System.out.println("You entered a positive integer "+input);
            else {
                System.out.println("You entered a negative integer "+input);
            }
        }
        else {
            System.out.println("Please Enter Valid Integer");
        }
    }

    private static void fourthDivisionbyZeroProblem(String[] args) {
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

    private static void fourthDivisionByZeroProblem(String[] args) {
        if (args.length < 3) {
            System.out.println("It is not enough elements!!!!");
            return;
        }
        System.out.println("First args is: " + args[0]);
        System.out.println("Second args is: " + args[1]);
        System.out.println("Third args is: " + args[2]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int divisionExact;
        int sum = a + b;
        int prod = a * b;
        System.out.printf("Sum is: %d \nProd is: %d", sum, prod);
        for (int i = 0; i <= args.length - 1; i++) {
            try {
                divisionExact = b / a;
                System.out.printf("\nDivision is: %d", divisionExact);}
            catch (ArithmeticException except) {
                System.out.println("\nAvoid dividing by integer 0" + except);
            }

            //a number raise to the power of some another number
            System.out.println(Math.pow(c,b));
        }

        //even numbers
        int n = 5;
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int i = 0; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //factorial number
        int fact=1;
        int number=5;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("\nFactorial of "+number+" is: "+fact);

        //prime numbers
        int i, count;
        System.out.println("\nPrime Numbers from 1 to" + number + "13 are : ");
        for(number = 1; number <= 13; number++)
        {
            count = 0;
            for (i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                System.out.print(number + " ");
            }
        }
    }

    private static void thirdDivisionByZeroProblem(String[] args) {
        int result;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();
        System.out.println("Enter a divisor: ");
        int divisor = keyboard.nextInt();

        if(n == 0 || divisor == 0) {
            System.out.println("You enter an invalid number for division");
        } else {
            result = n/divisor;
            System.out.println("Division is: " + result);
        }
    }

    private static void secondDivisionByZeroProblem(String[] args) {
        System.out.println("first number " + args[0]);
        System.out.println("second number " + args[1]);
        System.out.println("third number " + args[2]);

        if(args.length < 3) {
            System.out.println("Not enough numbers to calculate");
            return;
        }

        int a = Integer.parseInt(args[0]);//sintaxa asta primeste date de la user (de la tastatura)
        int b = Integer.parseInt(args[1]);//sintaxa asta primeste date de la user (de la tastatura)
        int c = Integer.parseInt(args[2]);

        if( a == 0 || b == 0 || c == 0 ){
            System.out.println("Change variables input value !!");
            return;
        }

        int sum = a + b;
        int prod = a * b;
        int division = prod / c;

        String nameOfCalculator = "Digit calculator";

        System.out.println(nameOfCalculator + " " + sum + " " + prod + " " + division);
    }

    private static void firstDivisionByZeroProblem(String[] args) {
        if (args.length <2) {
            System.out.println("Numar insuficient de argumente : "+ args.length);
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a==0 && b==0) {
            System.out.println("Operatia de impartire nu se poate efectua!\n Deimpartitul a = "+ args[0] + "\n Impartitorul b = "+ args[1]);
            return;
        }
        if (a==0 && b!=0 ) {
            System.out.println("Deimpartitul a = "+ String.valueOf(a));
            System.out.println("Impartitorul b = "+ String.valueOf(b));
            System.out.println("Rezultatul operatiei a/b = "+ a/b);
        }
        if (a!=0 && b==0 ) {
            //System.out.println("Deimpartitul a = "+ args[0]);
            System.out.println("Deimpartitul a = "+ String.valueOf(a));
            System.out.println("Impartitorul b = "+ String.valueOf(b));
            System.out.println("Operatiei a/b nu se poate efectua!");
            System.err.println();
            return;
        }
        if (a!=0 && b!=0 ) {
            System.out.println("Deimpartitul a = "+ args[0]);
            System.out.println("Impartitorul b = "+ args[1]);
            System.out.println("Rezultatul impartirii a/b = "+ Double.parseDouble(args[0])/Double.parseDouble(args[1]));
            System.out.println("Restul impartirii a/b = "+ a%b);

        }
    }
}
