package ro.fasttrackitMirelaAssignments;
import java.util.Scanner;

public class LeapYear {
    public static void checkForLeap (int year){

        boolean leap = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true;
                }
            }
        }
        if (!leap){
            System.out.println(year + " February has 28 days.");
        }
        else {
            System.out.println(year + " February has 29 days.");
        }
    }

    public static void main(String[] args) {
        int year = getYear(args);
        if (year <= 0){
            System.out.println("Please use a positive number");
            return;

        }
        if (year <=2021 && year >= 1900){
            checkForLeap(year);
        }
        else{
            System.out.println("Please enter another year, between 1900 - 2021.");

    }
}
private static int getYear(String[] args){
       try {
           return Integer.parseInt(args[0]);
       }
       catch (NumberFormatException exception){
           System.out.println("Please use a number.");
           return 0;
       }
    }
}

