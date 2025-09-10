import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] stairs;
    static int[] dp;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());
        stairs = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stairs[1];
        if (n >= 2) dp[2] = stairs[1] + stairs[2];
        if (n >= 3) dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
        }

        System.out.println(dp[n]);
    }
}