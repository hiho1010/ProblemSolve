import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int K, N;
    static int[] lengths;

    private static void solution() throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        lengths = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lengths[i]);
        }

        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long count = 0;
            for (int length : lengths) {
                count += length / mid;
            }

            if (count >= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.print(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}