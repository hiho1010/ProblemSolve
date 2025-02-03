import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[b].add(a);
        }

        int[] hackCounts = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            count = 0;
            dfs(i);
            hackCounts[i] = count;
        }

        int maxCount = 0;
        for (int i = 1; i <= n; i++) {
            if (hackCounts[i] > maxCount) {
                maxCount = hackCounts[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if (hackCounts[i] == maxCount) {
                System.out.print(i + " ");
            }
        }
    }

    static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}