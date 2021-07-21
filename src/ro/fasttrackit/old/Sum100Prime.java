package ro.fasttrackit.old;

import java.util.Scanner;

public class Sum100Prime {
    public static void main(String[] args) {
        int prime;
        int sum = 0;

        System.out.println("Sum of the first 100 prime numbers is: ");
        for(int i=1; i<= 100; i++) {
            if(i == 1 || i == 0)
                continue;

            prime = 1;

            for(int j=2; j<= i/2; j++) {
                if(i%j == 0) {
                    prime = 0;
                    break;
                }
            }
            if(prime == 1) {
                sum = sum + i;

            }

        }
        System.out.println(sum);

    }
}
