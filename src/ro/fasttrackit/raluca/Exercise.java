package ro.fasttrackit.raluca;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static final int IN_AGE = 18;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 3, 7, 35, 18, 0, 9, -1));
        if (!myList.contains(IN_AGE))
            return;

        for (int nr: myList){
            if (isNotInAge(nr))
                continue;

            System.out.println(nr);
        }


    }
    private static boolean isNotInAge(int nr) {
        return nr < IN_AGE;
    }
}
