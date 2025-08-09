import java.io.*;

public class Main {
    static int N;
    static int target;
    static int[][] snail;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int r = 0, c = 0, d = 0;
    static int targetR = 0, targetC = 0;
    static StringBuilder sb = new StringBuilder();

    static void print(int[][] graph) {
        for (int r = 0; r < graph.length; r++) {
            for (int c = 0; c < graph.length; c++) {
                if (target == snail[r][c]) {
                    targetR = r + 1;
                    targetC = c + 1;
                }
                sb.append(snail[r][c] + " ");
            }
            sb.append("\n");
        }
        sb.append(targetR + " " + targetC);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());
        snail = new int[N][N];

        for (int i = N*N; i > 0; i--) {
            snail[r][c] = i;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= N || nc < 0 || nc >= N || snail[nr][nc] != 0) {
                d = (d + 1) % 4;
                nr = r + dr[d];
                nc = c + dc[d];
            }
            r = nr;
            c = nc;
        }
        print(snail);
    }
}