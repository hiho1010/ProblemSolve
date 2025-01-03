import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int r = x; r < x + 10; r++) {
                for (int c = y; c < y + 10; c++) {
                    if (!paper[r][c]) {
                        paper[r][c] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}