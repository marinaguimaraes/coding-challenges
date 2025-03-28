package prepare.java.bignumber;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        sortArray(n, s);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

    static void sortArray(int n, String[] s) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                String strI = s[i];
                String strJ = s[j];
                BigDecimal bdI = new BigDecimal(strI);
                BigDecimal bdJ = new BigDecimal(strJ);
                if (bdI.compareTo(bdJ) < 0) {
                    // shift values to keep order
                    for (int k=j; k>i; k--) {
                        s[k] = s[k-1];
                    }
                    s[i] = strJ;
                }
            }
        }
    }

}