/**
 * Author : Tusa Letitia-Melania
 * Write a program to find the numbers greater than the average numbers given
 * Write a Java program to find the numbers greater than the average of the numbers of a given list of numbers
 * Example:
 * Given numbers: 3 4 5 6 7
 * Average: 5
 * Numbers bigger than the average: 6 and 7
 */
package ro.fasttrackit.mela.teme;

import java.util.ArrayList;
import java.util.Arrays.*;
import java.util.List;

public class OperationGreaterThanAverage {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(4,7,3,5,6));
        if (myList.isEmpty()) {
            System.out.println("The list does not contain items! Please enter items!");
            return;
        }
        if (!myList.isEmpty()) {
            java.util.Collections.sort(myList);
            calculateBiggerThanAvarage(myList);
        }
    }

    private static void calculateBiggerThanAvarage(ArrayList<Integer> myList) {
        int avg = calculateAverageNumber(myList);
        System.out.print("Bigger numbers than the average are : " );
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > avg)
               System.out.print(myList.get(i) +" ");
        }
    }

    private static int calculateAverageNumber(ArrayList<Integer> myList) {
        int amountNumbers = 0;
        for (int nr : myList) {
            amountNumbers +=nr;
        }
        System.out.println("The sum of the array content is : "+ amountNumbers);
        System.out.println("Size of the array is : "+ myList.size());
        int averageNumbers = amountNumbers/myList.size();
        System.out.println("The average of the array contents is : "+averageNumbers);
        return averageNumbers;
    }
}
