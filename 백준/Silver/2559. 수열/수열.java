import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int MAX_TEMPERATURE;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] temperatures = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int tmp = 0;
        for (int j = 0; j < K; j++) {
            tmp += temperatures[j];
        }
        MAX_TEMPERATURE = tmp;
        for (int i = 1; i < N - K + 1; i++) {
            tmp += temperatures[i+K-1] - temperatures[i-1];
            if(tmp > MAX_TEMPERATURE) {
                MAX_TEMPERATURE = tmp;
            }
        }
        System.out.println(MAX_TEMPERATURE);
    }
}