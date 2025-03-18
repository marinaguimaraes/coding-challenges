package prepare.java.introduction;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if (fitsInByte(x)) System.out.println("* byte");
                if (fitsInShort(x)) System.out.println("* short");
                if (fitsInInt(x)) System.out.println("* int");
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    static boolean fitsInByte(long x) {
        return x >= -128 && x <= 127;
    }

    static boolean fitsInShort(long x) {
        return x>=-32768 && x<=32767;
    }

    static boolean fitsInInt(long x) {
        return x >= -Math.pow(2, 31) && x <= (Math.pow(2, 31) - 1);
    }
}
