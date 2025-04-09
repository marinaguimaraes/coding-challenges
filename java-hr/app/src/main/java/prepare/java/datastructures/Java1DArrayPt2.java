package prepare.java.datastructures;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java1DArrayPt2 {
    public static boolean canWin(int leap, int[] game) {
//        return canWin(leap, game, 0);
        return canWinRecursive(leap, game, 0, false, 0);
    }

    private static boolean canWinRecursive(int leap, int[] game, int currentPosition, boolean canWalkBackwards, int positionsBackwards) {
        if (currentPosition >= game.length) {
            return true;
        }

        if (currentPosition < 0 || game[currentPosition] == 1 || (leap != 0 && positionsBackwards >= leap)) {
            return false;
        }

        return canWinRecursive(leap, game, currentPosition + 1, false, 0)
                || (leap > 1 && canWinRecursive(leap, game, currentPosition+leap, true, 0))
                || (canWalkBackwards && canWinRecursive(leap, game, currentPosition-1, true, positionsBackwards+1));
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("output.txt");
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            String canWin = (canWin(leap, game)) ? "YES" : "NO";
            System.out.println(canWin);
            fileWriter.write(canWin + "\n");
        }
        fileWriter.close();
        scan.close();
    }

    /*
     This version is a simpler solution that I saw after completion on the Discussion tab.
     It works well, but I do not fully understand marking the current position to 1 (and that is key to this solution).

     public static boolean canWin(int leap, int[] game, int i) {
        int gameLen = game.length;
        if(i>=gameLen){
            return true;
        }
        if(i<0 || game[i]==1){
            return false;
        }
        game[i] =1;
        return canWin(leap, game, i+leap) ||
                canWin(leap, game, i+1) || canWin(leap, game, i-1);
    }

     */
}
