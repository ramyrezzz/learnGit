package ro.FasttrackIT;

public class Main {

    // check if the number n is prime
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;

        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int sum = 0;
        while (i < 100) {
            //System.out.println("i: " + i);
            if (isPrime(n)) {
                System.out.println("n: " + n + " is prime.");
                sum = sum + n;
                i = i + 1;
            }
            //System.out.println("n: " + n);
            n++;
        }
        System.out.println("Sum of the first 100 prime numbers are: " + sum);
    }
}
