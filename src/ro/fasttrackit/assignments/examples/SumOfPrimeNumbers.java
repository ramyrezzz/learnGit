package ro.fasttrackit.assignments.examples;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int number;
        int i, count, sum = 0;
        System.out.println("\nPrime Numbers from 1 to 100 are: ");
        for (number = 1; number <= 100; number++) {
            count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                System.out.print(number + " ");
                sum = sum + number;
            }
        }
        System.out.println("\nThe sum of the first 100 numbers is: " + sum);
    }
}
