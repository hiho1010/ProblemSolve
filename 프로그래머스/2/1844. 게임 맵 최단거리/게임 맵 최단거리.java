
import java.util.ArrayDeque;

class Solution {
    static ArrayDeque<int[]> Q;
    static int N, M;
    static int[][] dist;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] board;
    static int answer;
    static boolean flag = false;

    static void bfs() {
        Q = new ArrayDeque<>();
        Q.addLast(new int[]{0, 0});
        dist[0][0] = 1;

        while (!Q.isEmpty()) {
            int[] current = Q.removeFirst();
            int cur_r = current[0];
            int cur_c = current[1];

            if (cur_r == N-1 && cur_c == M-1) {
                flag = true;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) {
                    continue;
                }
                if (board[nr][nc] == 0 || dist[nr][nc] > 0) {
                    continue;
                }
                dist[nr][nc] = dist[cur_r][cur_c] +1;
                Q.addLast(new int[] {nr, nc});

            }
        }


    }

    public static int solution(int[][] maps) {
        board = maps;
        N = maps.length;
        M = maps[0].length;
        dist = new int[N][M];
        bfs();
        answer = flag ? dist[N - 1][M - 1] : -1;
        return answer;
    }
}