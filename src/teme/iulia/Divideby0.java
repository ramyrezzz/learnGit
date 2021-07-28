package teme.iulia;

public class Divideby0 {
    public static void main(String[] args) {

        //Verify that the input coming into your application is different than 0Assignment
        int firstArgs = 4;
        int secondArgs = 4;
        int thirdArgs = 0;
        //int z=0;

        int[] numberString = {2, 3, 4, 5, 6, 7, 9, 8, 81, 100};
        System.out.print("This is our string : ");
        for (int j : numberString) {
            System.out.print(j + ", ");
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
        for (int j : numberString) {
            if (j % 2 == 1)
                System.out.print(j + ",");
        }
        System.out.println();
    }
}
