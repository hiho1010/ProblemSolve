import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int x;

    public static void main(String[] args) throws IOException {
        x = Integer.parseInt(br.readLine());

        int[] memo = new int[x + 1];

        for (int i = 2; i <= x; i++) {
            memo[i] = memo[i - 1] + 1;

            if (i % 2 == 0) {
                memo[i] = Math.min(memo[i], memo[i / 2] + 1);
            }

            if (i % 3 == 0) {
                memo[i] = Math.min(memo[i], memo[i / 3] + 1);
            }
        }

        System.out.println(memo[x]);
    }
}