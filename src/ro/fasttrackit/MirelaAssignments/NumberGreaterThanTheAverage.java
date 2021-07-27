package ro.fasttrackit.MirelaAssignments;

import java.util.ArrayList;
import java.util.List;

public class NumberGreaterThanTheAverage {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 3, 9, 5, 8};
        int total = 0;
        for(int number : numbers){
            total += number;
        }

        int average = total / numbers.length;

        System.out.println("The average of the given numbers is: " + average);
        System.out.print("The number bigger than the average are: " );

    for (int number : numbers){
        if (number > average ){
            System.out.print(number + " ");
        }
    }

        }
}









