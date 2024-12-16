import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] house;
    static int N;
    static int count = 0;

    static int[] dx = {0, 1, 1};
    static int[] dy = {1, 0, 1};

    public void solution() throws Exception {
        N = Integer.parseInt(br.readLine());
        house = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 1, 0);

        System.out.println(count);
    }

    private void dfs(int x, int y, int dir) {
        if (x == N - 1 && y == N - 1) {
            count++;
            return;
        }

        for (int i = 0; i < 3; i++) {
            if ((dir == 0 && i == 1) || (dir == 1 && i == 0)) {
                continue;
            }

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= N || ny >= N || house[nx][ny] == 1) {
                continue;
            }

            if (i == 2 && (house[x + 1][y] == 1 || house[x][y + 1] == 1)) {
                continue;
            }

            dfs(nx, ny, i);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}