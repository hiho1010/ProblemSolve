import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] distances;
    static int[] prices;
    static int min;

    private static void solution() throws Exception {
        N = Integer.parseInt(br.readLine());
        distances = new int[N - 1];
        prices = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        min = calculateMinimumPrice(distances, prices);
        System.out.println(min);
    }

    private static int calculateMinimumPrice(int[] distances, int[] prices) {
        int minPrice = prices[0];
        int totalCost = 0;

        for (int i = 0; i < distances.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            totalCost += minPrice * distances[i];
        }

        return totalCost;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}