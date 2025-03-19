package prepare.java.strings;

import java.util.Scanner;

public class JavaStringReverse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        sc.close();
        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }

    public static boolean isPalindrome(String str) {
        for (int i=0, j=str.length()-1; i<=j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
