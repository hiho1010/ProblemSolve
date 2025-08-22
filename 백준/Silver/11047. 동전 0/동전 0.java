import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                int use = K / coin[i];
                cnt += use;
                K -= use * coin[i];
            }
            if (K == 0) break;
        }

        System.out.println(cnt);
    }
}