import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static int[] ices = new int[1000001];
    static int max, maxLocation;

    private static void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        maxLocation = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ice = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            ices[location] = ice;
            maxLocation = Math.max(maxLocation, location);
        }

        int windowSize = 2 * K + 1;
        int currentSum = 0;

        for (int i = 0; i < windowSize && i <= maxLocation; i++) {
            currentSum += ices[i];
        }

        max = currentSum;

        for (int i = windowSize; i <= maxLocation; i++) {
            currentSum += ices[i];
            currentSum -= ices[i - windowSize];
            max = Math.max(max, currentSum);
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}