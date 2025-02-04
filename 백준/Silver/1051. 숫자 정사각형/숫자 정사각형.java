import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int maxSquareSize = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int size = 1; size <= Math.min(N - i, M - j); size++) {
                    if (map[i][j] == map[i][j + size - 1] && 
                        map[i][j] == map[i + size - 1][j] && 
                        map[i][j] == map[i + size - 1][j + size - 1]) {
                        maxSquareSize = Math.max(maxSquareSize, size);
                    }
                }
            }
        }

        System.out.println(maxSquareSize * maxSquareSize);
    }
}