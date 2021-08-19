package ro.fasttrackit.assignments.adi;

import java.util.Scanner;

public class TemaLab9 {

    public static boolean isPalindrome(int a) {
        int original = a;
        int reversed = 0;
        while (a != 0) {
            int remainder = a % 10;
            reversed = reversed * 10 + remainder;
            a = a / 10;
        }
        if (original == reversed)
            return true;

        return false;
    }

    public static void main(String[] args) {
        // Read the number n from keyboard
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (isPalindrome(n))
            System.out.println("The number " + n + " is palindrome");
        else
            System.out.println("The number " + n + " is not palindrome");
    }
}
