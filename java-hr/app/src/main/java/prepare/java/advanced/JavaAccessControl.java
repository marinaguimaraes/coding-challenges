package prepare.java.advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class JavaAccessControl {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

        // Inner is a static nested class, and can be instantiated via new Inner()
        // Private is a non-static inner class from Inner, so it should be instantiated using an instance of Inner
        // with the instance of Private, now I can normally call powerof2
        o = new Inner().new Private();
        String result = ((Inner.Private) o).powerof2(num);

        System.out.println(num +" is "+result);

        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution

