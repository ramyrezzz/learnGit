public class Tema {
    public static void main(String[] args) {

        //Verify that the input coming into your application is different than 0Assignment
        int firstArgs = 4;
        int secondArgs = 4;
        int thirdArgs = 0;
        //int z=0;

        int numberString[] = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        System.out.print("This is our string : ");
        for (int i = 0; i < numberString.length; i++) {
            System.out.print(numberString[i] + ", ");
        }
        System.out.println();

        int n = numberString.length;
        System.out.print("\n even number: ");
        for (int i = 0; i < n; i++) {
            if (numberString[i] % 2 == 0)
                System.out.print(numberString[i] + ",");
        }
        System.out.println();

        System.out.print("\n odd numbers: ");
        for (int i = 0; i < n; i++) {
            if (numberString[i] % 2 == 1)
                System.out.print(numberString[i] + ",");
        }
        System.out.println();

        //Print all even numbers that exists until a given numberAssignment

        if (thirdArgs != 0) {
            float division = secondArgs / thirdArgs;
            System.out.println(division);
        } else {
            System.out.println("\nDivision cannot be executed");
        }

        //Verify that the input coming into your application is different than 0Assignment

        int fact = 1;
        int f;
        for (f = 1; f <= firstArgs; f++) {
            fact = fact * f;
        }
        System.out.println("\n Factorial number is:" + fact);

        //Calculate the Factorial of a number using command-line argumentsAssignment

        System.out.println();

        //Print all prime numbers until a certain given numberAssignment

        int i, m = 0, flag = 0;
        int p = 9;//it is the number to be checked
        m = p / 2;
        if (p == 0 || p == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (p % i == 0) {
                    System.out.println(p + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(p + " is prime number");
            }
        }
    }
}
