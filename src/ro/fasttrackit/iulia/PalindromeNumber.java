package ro.fasttrackit.iulia;
import java.util.Scanner;

public class PalindromeNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number to check if it's a palindrome: ");
            int inputNumber = input.nextInt();
            if (inputNumber < 1000){
                System.out.println("The number has less than 4 digits.");
                return;
            }
            int reverseNumber = getReverseNumberForPalindrome(inputNumber);
            printResultOfPalindrome(inputNumber, reverseNumber);
        }

        private static int getReverseNumberForPalindrome(int inputNumber) {
            int reverseNumber = 0;
            while (inputNumber != 0) {
                reverseNumber = multiplyByTen(reverseNumber) + moduloOfTen(inputNumber);
                inputNumber = divisionbyTen(inputNumber);
            }
            return reverseNumber;
        }

        private static void printResultOfPalindrome(int copyNumber, int reverseNumber) {
            if (copyNumber == reverseNumber){
                System.out.println("The number is palindrome!");
                return;
            }
            System.out.println("The number is not palindrome!");
        }

        private static int divisionbyTen(int inputNumber) {
            return inputNumber / 10;
        }

        private static int moduloOfTen(int inputNumber) {
            return inputNumber % 10;
        }

        private static int multiplyByTen(int reverseNumber) {
            return reverseNumber * 10;
        }
    }

