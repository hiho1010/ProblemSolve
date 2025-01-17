import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] records;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        records = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            records[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(records);

        int left = 0, right = N - 1;
        int closestSum = Integer.MAX_VALUE;
        int answerLeft = 0, answerRight = 0;

        while (left < right) {
            int sum = records[left] + records[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                answerLeft = records[left];
                answerRight = records[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(answerLeft + " " + answerRight);
    }
}