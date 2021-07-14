package ro.fasttrackit.assignments.tomi;

import java.util.Scanner;

public class PalindromeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string for verify :");
        String typedString = sc.next();
        String reversedString ="";
        for (int j = typedString.length() - 1; j >= 0; j--) {
            reversedString = reversedString + typedString.charAt(j);
        }
        System.out.println(reversedString);
        if (typedString.equals(reversedString))
        {
            System.out.println("IS PALINDROME");
        }
        else
        {
            System.out.println("IS NOT PALINDROME");
        }
    }
}
