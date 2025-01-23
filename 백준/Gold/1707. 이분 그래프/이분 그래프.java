import java.io.*;
import java.util.*;

public class Main {
    static int V, E;
    static List<Integer>[] graph;
    static int[] colors;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            
            graph = new ArrayList[V + 1];
            colors = new int[V + 1];
            
            for (int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }
            
            if (isBipartiteGraph()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.println(sb.toString());
    }
    
    static boolean isBipartiteGraph() {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= V; i++) {
            if (colors[i] == 0) {
                queue.add(i);
                colors[i] = 1;
                
                while (!queue.isEmpty()) {
                    int current = queue.poll();
                    
                    for (int neighbor : graph[current]) {
                        if (colors[neighbor] == 0) {
                            colors[neighbor] = (colors[current] == 1) ? 2 : 1;
                            queue.add(neighbor);
                        } else if (colors[neighbor] == colors[current]) {
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}