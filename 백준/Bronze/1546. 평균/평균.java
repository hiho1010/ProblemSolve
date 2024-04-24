
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static long max, sum;
    static double avg;
    static long[] scores;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        scores = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        max = Arrays.stream(scores).max().getAsLong();

        for (long score : scores) {
            sum += score;
        }
        avg = (double) sum /max/n*100;

        System.out.println(avg);

    }
}