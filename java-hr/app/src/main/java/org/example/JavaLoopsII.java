package org.example;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for (int currentQ=0; currentQ<q; currentQ++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = 0;
            StringBuilder currentSeries = new StringBuilder();
            for (int i=0; i<n; i++) {
                if (i == 0) {
                    s = a + (int) Math.pow(2, i) * b;
                } else {
                    s += (int) Math.pow(2, i) * b;
                    currentSeries.append(" ");
                }

                currentSeries.append(s);
            }

            System.out.println(currentSeries);
        }
        in.close();
    }
}
