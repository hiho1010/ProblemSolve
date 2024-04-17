
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int V, E;
    static boolean[] visited;
    static ArrayList<Integer> tracks = new ArrayList<>();
    static int startNode = 1;
    static ArrayList<Integer>[] adj;

    static int cnt;

    public static void main(String[] args) throws IOException {

        V = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        visited = new boolean[V + 1];

        adj = new ArrayList[V+1];
        for (int i = 0; i < V+1; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) { // E번 반복해야 함
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start].add(end);
            adj[end].add(start);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>(List.of(startNode));
        visited[startNode] = true; // 시작 노드 방문 체크

        while (!stack.isEmpty()) { // tracks.isEmpty() -> stack.isEmpty()로 수정
            int cur = stack.removeLast();
            tracks.add(cur); // 방문한 노드를 tracks 리스트에 추가

            for (Integer destination : adj[cur]) {
                if (!visited[destination]) {
                    visited[destination] = true; // 방문한 노드로 체크
                    stack.addLast(destination);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
