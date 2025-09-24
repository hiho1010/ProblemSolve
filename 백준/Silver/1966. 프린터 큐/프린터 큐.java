import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Deque<int[]> q = new ArrayDeque<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                q.offer(new int[]{importance, i});
                pq.offer(importance);
            }

            int count = 0;
            while (!q.isEmpty()) {
                int[] current = q.peek();
                int currentImportance = current[0];
                int currentIndex = current[1];

                if (currentImportance == pq.peek()) {
                    q.poll();
                    pq.poll();
                    count++;

                    if (currentIndex == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    q.poll();
                    q.offer(current);
                }
            }
        }
    }
}