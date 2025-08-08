import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char[][] board;
    static int N, M;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                findMin(i, j);
            }
        }

        System.out.println(min);
    }

    static void findMin(int startRow, int startCol) {
        int cntW = 0;
        int cntB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int currentRow = startRow + i;
                int currentCol = startCol + j;

                if ((i + j) % 2 == 0) {
                    if (board[currentRow][currentCol] != 'W') {
                        cntW++;
                    }
                    if (board[currentRow][currentCol] != 'B') {
                        cntB++;
                    }
                }
                else {
                    if (board[currentRow][currentCol] != 'B') {
                        cntW++;
                    }
                    if (board[currentRow][currentCol] != 'W') {
                        cntB++;
                    }
                }
            }
        }

        min = Math.min(min, Math.min(cntW, cntB));
    }
}