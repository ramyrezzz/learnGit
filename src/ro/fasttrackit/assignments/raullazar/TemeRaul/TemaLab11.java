package ro.fasttrackit.assignments.raullazar.TemeRaul;

public class TemaLab11 {
    public static void main(String[] args) {


        int[] numbers = {1, 6, 9, 2, 7, 22, 7, 100, 77, 55};
        int total = 0;

        for (int number : numbers) {
            total += number;
        }
        double average = total / (float) numbers.length;
        System.out.println("Average is :" + average);
        for (int number : numbers) {
            if (number > average) {
                System.out.println("The numbers in the array that are greater than the average is: " + number);
            }
        }
    }
}

