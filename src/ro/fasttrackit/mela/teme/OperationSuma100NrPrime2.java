/**
 * Autor : Tusa Letitia-Melania
 * Calculate the sum of the first 100 prime numbers
 * I was unable to generate the code using the for command instead of while
 * for (int count=1; count<=nrPrime; count++)
 */

package ro.fasttrackit.mela.teme;

import java.util.Scanner;

public class OperationSuma100NrPrime2 {
    public static void main(String[] args) {
        int nrPrime;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers for which you want to make the sum: ");
        nrPrime = input.nextInt();
        System.out.print("First " + nrPrime + " prime numbers are: ");
        generate(nrPrime);
    }
    public static void generate(int nrPrime) {
        int sum = 0;
        int ok = 0;
        int y = nrPrime;
        int nr = 2;
        while (1 <= nrPrime)
        {
            ok = 0;
            for (int i = 2; i <= nr / 2; i++) {
                if (nr % i == 0) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) {
                System.out.print(nr + " ");
                nrPrime--;
                sum += nr;
            }
            nr++;
        }
        System.out.println();
        System.out.print("The amount of first " + y + " prime numbers are : " + sum);
    }
}



