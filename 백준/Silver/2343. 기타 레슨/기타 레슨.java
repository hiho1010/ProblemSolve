import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[] records;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        records = new int[N];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            records[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, records[i]);
            sum += records[i];
        }
        int left = max;
        int right = sum;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canDivide(mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    static boolean canDivide(int size) {
        int count = 1;
        int sum = 0;

        for (int record : records) {
            if (sum + record > size) {
                count++;
                sum = record;
                if (count > M) {
                    return false;
                }
            } else {
                sum += record;
            }
        }
        return true;
    }
}