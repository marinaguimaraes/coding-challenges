package prepare.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static final byte B;
    private static final byte H;
    private static final boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextByte();
        H = scanner.nextByte();

        flag = B > 0 && H > 0;

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        scanner.close();
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    } //end of main

}
//end of class


