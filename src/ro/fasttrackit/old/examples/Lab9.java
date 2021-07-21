package ro.fasttrackit.old.examples;

import java.util.ArrayList;
import java.util.List;

public class Lab9 {

    public static final int IN_AGE = 18;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1,3,7,35,18,0,9,-1));

        int i = -1;
        for(int nr: myList) {
            if (i >= 0)
                break;
            if (isNotInAge(nr))
                continue;
            i = nr;
            System.out.println(nr);
        }
    }

    private static boolean isNotInAge(int nr) {
        return nr < IN_AGE;
    }
}

//CTRL + ALT + M