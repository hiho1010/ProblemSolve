import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int cnt, V, E;
    static HashSet<Integer> visited = new HashSet<>();
    static ArrayDeque<Integer> stack = new ArrayDeque<>(Arrays.asList(1));
    static int[][] adj;

    public static void main(String[] args) throws IOException {
        V = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        adj = new int[V+1][V+1];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start][end] = adj[end][start] = 1;
        }

        while (!stack.isEmpty()) {
            int cur = stack.removeLast();

            if (!visited.contains(cur)) {
                visited.add(cur);
            }

            for (int nxt = 0; nxt < V + 1; nxt++) {
                if (!visited.contains(nxt) && adj[cur][nxt] == 1) {
                    stack.add(nxt);
                }
            }
        }
        System.out.println(visited.size()-1);
    }
}