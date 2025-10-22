import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int target = Integer.parseInt(br.readLine().trim());

        int[][] a = new int[N][N];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0, d = 0;
        int num = N * N;

        int ansR = -1, ansC = -1;

        while (num >= 1) {
            a[x][y] = num;
            if (num == target) {
                ansR = x;
                ansC = y;
            }

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N || a[nx][ny] != 0) {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }

            x = nx;
            y = ny;
            num--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(a[i][j]).append(' ');
            }
            sb.append('\n');
        }
        sb.append((ansR + 1)).append(' ').append((ansC + 1)).append('\n');

        System.out.print(sb.toString());
    }
}