import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int order = 1;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == order) {
                order++;
                while (!stack.isEmpty() && stack.peek() == order) {
                    stack.pop();
                    order++;
                }
            } else {
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == order) {
            stack.pop();
            order++;
        }

        if (order == N + 1) {
            System.out.println("Nice");
            return;
        }
        System.out.println("Sad");
    }
}