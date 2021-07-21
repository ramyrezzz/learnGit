package ro.fasttrackit.assignments.tomi;

import java.util.ArrayList;

public class TemaLab11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println("The ArrayList is : "+numbers);
        int a = numbers.get(0);
        int b = numbers.get(1);
        int c = numbers.get(2);
        int d = numbers.get(3);
        int e = numbers.get(4);
        int average = (a + b + c + d + e) / 5;
        System.out.println("Average value : "+average);
        if (numbers.get(0) > average) {
            System.out.println(numbers.get(0));
        }
        if (numbers.get(1) > average){
            System.out.println("Greater value is: "+numbers.get(1));
        }
        if (numbers.get(2) > average){
            System.out.println("Greater value is: "+numbers.get(2));
        }
        if (numbers.get(3) > average){
            System.out.println("Greater value is: "+numbers.get(3));
        }
        if (numbers.get(4) > average){
            System.out.println("Greater value is: "+numbers.get(4));
        }
    }
}



