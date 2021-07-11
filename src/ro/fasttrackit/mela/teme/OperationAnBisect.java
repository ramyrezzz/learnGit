/**
 * Autor Tusa Letitia-Melania
 * Display the number of days in month February from a year between 1900-2016 that is read from keyboard
 * A year is a leap year if:
 * -Is divisible by 4 but not by 100
 * -Is divisible by 100 but not by 400
 */
package ro.fasttrackit.mela.teme;

import java.util.*;

public class OperationAnBisect {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to check: ");
        year = input.nextInt();
        if (year <= 0) {
            System.out.print("Please insert a positive number!");
            return;
        }
        if (year < 1900 || year > 2021) {
            System.out.print("Please insert an year between 1900-2021!");
            return;
        }
        if (year >= 1900 && year <= 2021) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is leap year!");
                System.out.print("In leap year, February month has 29 days!");
                return;
            }
            System.out.println("The year " + year + " is not leap year!");
            System.out.print("In non leap year, February month has 28 days!");
        }
    }
}
