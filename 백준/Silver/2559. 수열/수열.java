import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] temp;
    static int N, K;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N ; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += temp[i];
        }

        int max = sum;

        for (int i = K; i < N; i++) {
            sum = sum - temp[i - K] + temp[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}