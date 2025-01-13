import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] dp;

    private static void solution() throws Exception {
        N = Integer.parseInt(br.readLine());

        dp = new int[Math.max(1001, N + 1)];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        
        for (int i = 4; i <= N; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }

        if (dp[N] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}