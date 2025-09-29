import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int MAX_N = 1000;
    static final int MOD = 10007;
    static int[] dp = new int[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= MAX_N; i++) {
            dp[i] = (2 * dp[i - 2] + dp[i - 1]) % MOD;
        }

        int n = Integer.parseInt(br.readLine());
        System.out.println(dp[n]);
    }
}