import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int T;
    static int[][] map;
    static boolean[][] visited;
    // 행/열 기준으로 정의: r(행), c(열)
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int N, M, K; // N=세로(행), M=가로(열)

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();

        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로(열)
            N = Integer.parseInt(st.nextToken()); // 세로(행)
            K = Integer.parseInt(st.nextToken());

            // (행=N, 열=M)
            map = new int[N][M];
            visited = new boolean[N][M];

            // 배추 위치 (x=열, y=행) → map[y][x]
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            int worms = 0;

            // 전체 스캔: 행→열
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (map[r][c] == 1 && !visited[r][c]) {
                        worms++;
                        dfs(r, c);
                    }
                }
            }

            out.append(worms).append('\n');
        }

        System.out.print(out);
    }

    private static void dfs(int r, int c) {
        visited[r][c] = true;

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            // 경계 체크
            if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;

            // 아직 방문 안했고 배추가 있는 칸만 진행
            if (!visited[nr][nc] && map[nr][nc] == 1) {
                dfs(nr, nc);
            }
        }
    }
}