import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Snowboots {
    static int[] sizeneeded;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("snowboots.in"));
        PrintWriter out = new PrintWriter(new File("snowboots.out"));
        int nsnow = in.nextInt();
        int nboots = in.nextInt();
        int[] snow = new int[nsnow];
        int[] dpsnow = new int[nsnow];
        int[] bootdepths = new int[nboots];
        int[] bootsteps = new int[nsnow];

        for(int i = 0; i < nsnow; i++) {
            snow[i] = in.nextInt();
        }

        int maxdepth = 0;
        for(int i = 0; i < nboots; i++) {
            bootdepths[i] = in.nextInt();
            bootsteps[i] = in.nextInt();
            maxdepth = Math.max(maxdepth, bootdepths[i]);
        }

        for(int i = 1; i <= maxdepth; i++) {

        }
    }

    public static int recur(int[] snow, int i, int jumpsize, int res) {
        if(i == snow.length - 1) return res;
        int calc1 = Integer.MAX_VALUE;
        //if(jumpsize != 1) calc1 =
        return 0;
    }
}
