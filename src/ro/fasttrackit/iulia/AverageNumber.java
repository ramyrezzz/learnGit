package ro.fasttrackit.iulia;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;


public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(4, 7, 3, 5, 6));
        if (myList.isEmpty()) {
            System.out.println("The list does not contain items! Please enter items!");
            return;
        }
        sort(myList);
        calculateBiggerThanAvarage(myList);
    }

    private static void calculateBiggerThanAvarage(ArrayList<Integer> myList) {
        int avg = calculateAverageNumber(myList);
        System.out.print("Bigger numbers than the average are : ");
        for (Integer integer : myList) {
            if (integer > avg)
                System.out.print(integer + " ");
        }
    }

    private static int calculateAverageNumber(ArrayList<Integer> myList) {
        int amountNumbers = 0;
        for (int nr : myList) {
            amountNumbers += nr;
        }
        System.out.println("The sum of the array content is : " + amountNumbers);
        System.out.println("Size of the array is : " + myList.size());
        int averageNumbers = amountNumbers / myList.size();
        System.out.println("The average of the array contents is : " + averageNumbers);
        return averageNumbers;
    }
}