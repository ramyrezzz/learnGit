package teme.iulia;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        int sum = 1;
        int ctr = 0;
        int num = 0;
        while (ctr < 100){
            num++;
            if (num % 2 != 0){
                if (is_Prime (num)){
                    sum += num;
                    ctr++;
                }
            }
        }
        System.out.println("\nSum of the first 100 prime numbers is: " + sum);
    }
    private static boolean is_Prime(int num){
        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
