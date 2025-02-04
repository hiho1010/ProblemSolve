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

        int maxSquareSize = Math.min(N, M);
        int answer = 1;

        for (int size = maxSquareSize; size >= 1; size--) {
            boolean found = false;
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    if (map[i][j] == map[i][j + size - 1] && 
                        map[i][j] == map[i + size - 1][j] && 
                        map[i][j] == map[i + size - 1][j + size - 1]) {
                        answer = size;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }

        System.out.println(answer * answer);
    }
}