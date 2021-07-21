package ro.fasttrackit.old;

public class NumberBiggerThanAverageNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,6,7,9};
        int sum = 0;
        int average = averageNumberOfTheList(numbers, sum);
        listNumbersBiggerThanAverageNumber(numbers, average);

    }

    private static int averageNumberOfTheList(int[] numbers, int sum) {
        for (int value: numbers) {
            sum += value;
        }
        int average = sum / numbers.length;
        return average;
    }

    private static int listNumbersBiggerThanAverageNumber(int[] numbers, int average) {
        for (int search: numbers) {
            if (search > average)
                System.out.println(search);
        }
        return average;

    }
}
