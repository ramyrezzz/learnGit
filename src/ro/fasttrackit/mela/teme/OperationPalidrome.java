/**
 * Autor Tusa Letitia-Melania
 * Check if the number is palindrome
 * Implement an application that would read a number from the keyboard, and verify if the number is palindrome.
 * number > 3 digits
 * Palindrome = number written in reverse is equal to itself
 */
package ro.fasttrackit.mela.teme;

import java.util.Scanner;

public class OperationPalidrome {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check if is Palidrome: ");
        number = input.nextInt();
        if (number < 1000) {
            System.out.print("Enter the number >= 1000!");
            return;
        }
        if (number >= 1000) {
            int copyNumber = number;
            int reversNumber = 0;
            // the construction of the reverse/inverse
            while (number != 0) {
                reversNumber = reversNumber * 10 + number % 10; // reverse number digit with digit
                number = number / 10; // se taie pe rand cifrele lui n
            }
            // the Palidrom test + display the message
            if (copyNumber == reversNumber) {
                System.out.println("Numarul este Palindrom!");
            } else {
                System.out.println("Numarul nu este Palindrom!");
                return;
            }
        }
    }
}


