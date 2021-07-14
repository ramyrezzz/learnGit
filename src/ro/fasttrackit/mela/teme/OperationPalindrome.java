/**
 * Autor Tusa Letitia-Melania
 * Check if the number is palindrome
 * Implement an application that would read a number from the keyboard, and verify if the number is palindrome.
 * number > 3 digits
 * Palindrome = number written in reverse is equal to itself
 */
package ro.fasttrackit.mela.teme;

import java.util.Scanner;

public class OperationPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check if is Palindrome: ");
        int inputNumber = input.nextInt();
        if (inputNumber < 1000) {
            System.out.print("Enter the number >= 1000!");
            return;
        }
        int reversNumber = getReversNumberForPalindrome(inputNumber);
        printResultOfPalindrome(inputNumber, reversNumber);
    }

    private static int getReversNumberForPalindrome(int inputNumber) {
        int reversNumber = 0;
        while (inputNumber != 0) {
            reversNumber = multiplyByTen(reversNumber) + moduloOfTen(inputNumber); // reverse number digit with digit
            inputNumber = divisionByTen(inputNumber);
        }
        return reversNumber;
    }

    private static void printResultOfPalindrome(int copyNumber, int reversNumber) {
        if (copyNumber == reversNumber) {
            System.out.println("Numarul este Palindrom!");
            return;
        }
        System.out.println("Numarul nu este Palindrom!");
    }

    private static int divisionByTen(int inputNumber) {
        return inputNumber / 10;
    }

    private static int moduloOfTen(int inputNumber) {
        return inputNumber % 10;
    }

    private static int multiplyByTen(int reversNumber) {
        return reversNumber * 10;
    }
}


