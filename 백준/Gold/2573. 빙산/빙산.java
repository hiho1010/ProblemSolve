import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] iceberg;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        iceberg = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                iceberg[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int years = 0;

        while (true) {
            int chunks = countChunks();
            if (chunks >= 2) {
                System.out.println(years);
                return;
            }
            if (chunks == 0) {
                System.out.println(0);
                return;
            }

            meltIceberg();
            years++;
        }
    }

    static int countChunks() {
        visited = new boolean[N][M];
        int chunks = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (iceberg[i][j] > 0 && !visited[i][j]) {
                    dfs(i, j);
                    chunks++;
                }
            }
        }

        return chunks;
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (iceberg[nx][ny] > 0 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    static void meltIceberg() {
        int[][] melted = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (iceberg[i][j] > 0) {
                    int waterCount = 0;

                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < N && ny < M && iceberg[nx][ny] == 0) {
                            waterCount++;
                        }
                    }

                    melted[i][j] = Math.max(iceberg[i][j] - waterCount, 0);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                iceberg[i][j] = melted[i][j];
            }
        }
    }
}