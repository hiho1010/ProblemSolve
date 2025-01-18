import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[] records;

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());
        records = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            records[i] = Integer.parseInt(st.nextToken());
        }


        M = Integer.parseInt(br.readLine());
        int[] queries = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            queries[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(records);

        StringBuilder sb = new StringBuilder();
        for (int query : queries) {
            if (binarySearch(query)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.print(sb);
    }

    static boolean binarySearch(int target) {
        int left = 0, right = N - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (records[mid] == target) {
                return true;
            } else if (records[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}