import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        
        StringBuilder result = new StringBuilder();
        result.append("<");
        
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        
        result.append(">");
        System.out.println(result);
    }
}