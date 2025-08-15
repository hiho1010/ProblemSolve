import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayDeque<int[]> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.addLast(new int[]{i, move});
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            sb.append(current[0]).append(" ");

            if (deque.isEmpty()) break;

            int move = current[1];

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }
}