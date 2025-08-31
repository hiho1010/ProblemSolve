import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long count;
    static long FULL;

    static void dfs(int row, long cols, long d1, long d2) {
        if (row == N) { count++; return; }
        long avail = FULL & ~(cols | d1 | d2);
        while (avail != 0) {
            long p = avail & -avail;
            avail -= p;
            dfs(row + 1, cols | p, (d1 | p) << 1, (d2 | p) >> 1);
        }
    }

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        FULL = (1L << N) - 1;
        dfs(0, 0L, 0L, 0L);
        System.out.println(count);
    }
}