import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Guard {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("guard.in"));
        PrintWriter out = new PrintWriter(new File("guard.out"));
        int ncows = in.nextInt();
        int markheight = in.nextInt();
        HashMap<Integer, ArrayList<Integer[]>> dp = new HashMap<>();

        for(int i = 0; i < ncows; i++) {
            dp.get(1).add(new Integer[] {in.nextInt(), in.nextInt(), in.nextInt()});

        }

        int maxsafety = -1;/*
        for(int i = 0; i < index; i++) {
            dp[index] =
        }
*/
        out.close();
    }
/*
    public static int recur(int[] height, int[] weight, int[] strength, int index, int dp, int currsuppor, int markheight) {
        if(markheight <= 0) return currsuppor;
        if(currsuppor < 0) return -1;
        int max = -1;
        for(int i = index + 1; i < height.length; i++) {
            max = Math.max(recur(height, weight, strength, i, dp + (1 << i), Math.min(currsuppor - weight[i], strength[i]), markheight - height[i]), max);
        }
        return max;
    }
    */
}
