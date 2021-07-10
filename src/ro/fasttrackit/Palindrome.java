package ro.fasttrackit;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int mirror = 0, copy_n;
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();

        if(n > 99) {
            copy_n = n;


            while (n != 0) {
                mirror = mirror * 10 + n % 10;
                n = n / 10;
            }

            if (copy_n == mirror) {
                System.out.println("The number is palindrom");
            } else {
                System.out.println("The number is not palindrom");
            }
            return;
        } else {
            System.out.println("The number has less than 3 digits");
        }

    }
}

