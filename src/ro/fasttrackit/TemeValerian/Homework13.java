package ro.fasttrackit.TemeValerian;

import java.util.Arrays;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers will be in your array? ");
        int n = s.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("You entered the array: " + Arrays.toString(arr));

        double average = sum / arr.length;
        System.out.println("The average of the array is: " + average);

        System.out.println("The numbers in the array that are greater than the average are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println(arr[i]);
            }
        }
    }
}
