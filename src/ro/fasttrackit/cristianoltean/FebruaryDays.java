package ro.fasttrackit.cristianoltean;

import java.util.Scanner;

public class FebruaryDays {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int numberOfDaysInMonth = 0;
        String Month = "February";

        System.out.print("Input a year: ");
        int year = input.nextInt();
        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                numberOfDaysInMonth = 29;
            } else {
                numberOfDaysInMonth = 28;
            }
        }
        System.out.print("Month" + " " + " year " + numberOfDaysInMonth + "days\n");
    }
}
