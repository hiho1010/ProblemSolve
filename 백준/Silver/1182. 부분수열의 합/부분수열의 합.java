
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, S, cnt;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i < 1 << nums.length; i++) {
            int sum =0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += nums[j];
                }
            }
            if (sum == S) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}