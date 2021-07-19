package ro.fasttrackit;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();
        if (n <= 99) {
            System.out.println("The number has less than 3 digits");
            return;
        }
        int mirror = getMirroredNumber(n);
        System.out.println("The number is palindrom: " + (n == mirror));
    }

    public static int getMirroredNumber(int n) {
        int mirror = 0;
        while (n != 0) {
            mirror = mirror * 10 + n % 10;
            n = n / 10;
        }
        return mirror;
    }
}

