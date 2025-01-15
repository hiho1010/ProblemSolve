import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] points;

    private static void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        points = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points);

        sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 위에서 받은 시작값과 끝값을 통해 binary search
            // 시작하는 지점에서 뒤로 쭉 찾고, 끝나는 지점에서 뒤로 쭉 찾은 값을 빼준다
            int startIndex = binarySearch(start, 0);
            int endIndex = binarySearch(end, 1);

            sb.append(endIndex - startIndex + 1).append("\n");
        }
        System.out.println(sb);
    }

    private static int binarySearch(int target, int type) {
        int left = 0;
        int right = N - 1;
        if (type == 0) {
            while (left <= right) {
                int mid = (left + right) / 2;
                if(points[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
        else {
            while (left <= right) {
                int mid = (left + right) / 2;
                if(points[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}