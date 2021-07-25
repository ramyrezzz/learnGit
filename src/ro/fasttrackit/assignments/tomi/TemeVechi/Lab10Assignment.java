package ro.fasttrackit.assignments.tomi.TemeVechi;

import java.util.Scanner;

public class Lab10Assignment {

    public static void main(String[] args) {

        System.out.println("Year " + args[0]);
        int theYear = Integer.parseInt(args[0]);
        System.out.println(theYear);

        if (theYear % 4 == 0 && theYear % 100 != 0 || theYear % 400 == 0) {
            System.out.println("In the year " + theYear + " February has 29 days !");
        } else if (theYear % 4 != 0 || theYear % 100 == 0 || theYear % 400 != 0) {
            System.out.println("In the year " + theYear + " February has 28 days !");
        }



//        if(args.length == 3){
//            double a = Double.parseDouble(args[0]);
//            double b = Double.parseDouble(args[2]);
//            String operator = args[1];
//            if(operator.equals("+")){
//                double result = a + b;
//                System.out.println("Result is: " + result);
//            }
//            else if(operator.equals("-")){
//                double result = a - b;
//                System.out.println("Result is: " + result);
//            }
//            else if(operator.equals("*")){
//                double result = a * b;
//                System.out.println("Result is: " + result);
//            }
//            else if(operator.equals("/")) {
//                double result = a / b;
//                System.out.println("Result is: " + result);
//            }
//        }
//        else {
//            System.err.println("3 args are needed !");
//        }




//
//        System.out.println("The number " + args[0]);
//        int limit = Integer.parseInt(args[0]);
//        int i =0;
//        int num =0;
//        String primeNumbers = " ";
//
//        System.out.println("Enter a number:");
//        for (i = 1; i <= limit; i++)
//        {
//            int counter=0;
//            for(num =i; num>=1; num--)
//            {
//                if(i%num==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter ==2)
//            {
//                primeNumbers = primeNumbers + i + " ";
//            }
//        }
//        System.out.println("Prime numbers between 1 and 100 are:");
//        System.out.println(primeNumbers);
    }
}

