package org.example;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 1;
        while(input.hasNextLine())
        {
            String data = input.nextLine();
            System.out.println(lineNumber + " " + data);
            lineNumber++;
        }
    }
}
