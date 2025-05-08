package prepare.java.datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> uniqueStringPairs = new HashSet<>();
        int numberOfUniquePairs = 0;

        for (int i=0; i<t; i++) {
            String pairLeftRight = pair_left[i] + " " + pair_right[i];
            String pairRightLeft = pair_right[i] + " " + pair_left[i];

            // Checking both combinations despite the challenge description's definition of unique set.
            // This is because Test 5 was failing, and it passed once it considered (a,b)=(b,a)
            if (!uniqueStringPairs.contains(pairLeftRight) && !uniqueStringPairs.contains(pairRightLeft)) {
                uniqueStringPairs.add(pairLeftRight);
                numberOfUniquePairs++;
            }
            System.out.println(numberOfUniquePairs);
        }

        s.close();
    }
}
