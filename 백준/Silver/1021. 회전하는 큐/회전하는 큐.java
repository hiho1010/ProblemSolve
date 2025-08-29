import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int[] target;
    static ArrayDeque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        target = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int result = 0;

        for (int x : target) {
            int idx = 0;
            for (int val : deque) {
                if (val == x) break;
                idx++;
            }

            int left = idx;
            int right = deque.size() - idx;

            if (left <= right) {
                for (int i = 0; i < left; i++) {
                    deque.addLast(deque.pollFirst());
                    result++;
                }
            } else {
                for (int i = 0; i < right; i++) {
                    deque.addFirst(deque.pollLast());
                    result++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(result);
    }
}