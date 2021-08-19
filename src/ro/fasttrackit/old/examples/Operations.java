package ro.fasttrackit.old.examples;

public class Operations {
    public static void main(String[] args) {
        calculatePrimeNumbers(args);
    }

    public static void calculatePrimeNumbers(String[] args) {
        int number = 100;
        System.out.println("List of prime numbers from 1 to " + number + ": ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
