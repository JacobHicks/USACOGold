import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AtLarge {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("atlarge.in"));
        PrintWriter out = new PrintWriter(new File("atlarge.out"));

        int nfarms = in.nextInt();
        int surface = in.nextInt();
        int[][] graph = new int[nfarms][nfarms];

    }
}
