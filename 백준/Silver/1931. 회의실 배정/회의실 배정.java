import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] times;
    static int N = 0, lastEnd = 0, cnt = 0;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        times = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times[i][0] = start;
            times[i][1] = end;
        }

        Arrays.sort(times, (o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0]);

        for (int[] time : times) {
            if (lastEnd <= time[0]) {
                cnt += 1;
                lastEnd = time[1];
            }
        }

        System.out.println(cnt);

    }
}