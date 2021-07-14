package ro.fasttrackit.assignments.boty;

public class printPrimeNumbers {

    public static void main(String[] args) {
        for (int i = 2; i <= 250; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}

