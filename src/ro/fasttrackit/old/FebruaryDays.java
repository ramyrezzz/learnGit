package ro.fasttrackit.old;

import java.util.Scanner;

public class FebruaryDays {
    public static void main(String[] args) {

        int days;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = keyboard.nextInt();
        if (year < 1900 || year > 2021) {
            System.out.println("The year is not between 1900 and 2021");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days = 29;
            System.out.println("February has: " + days);
        } else {
            days = 28;
            System.out.println("February has: " + days);
        }

    }
}
