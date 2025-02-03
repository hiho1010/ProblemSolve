import java.io.*;

public class Main {
    static char[][] board;
    static int N, M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        N = Integer.parseInt(sizes[0]);
        M = Integer.parseInt(sizes[1]);
        
        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        int minRepaints = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minRepaints = Math.min(minRepaints, getRepaintCount(i, j));
            }
        }
        
        System.out.println(minRepaints);
    }
    
    static int getRepaintCount(int x, int y) {
        int repaints1 = 0; // 시작이 'B'인 경우
        int repaints2 = 0; // 시작이 'W'인 경우
        char[] colors = {'B', 'W'};
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i][y + j] != colors[(i + j) % 2]) {
                    repaints1++;
                }
                if (board[x + i][y + j] != colors[(i + j + 1) % 2]) {
                    repaints2++;
                }
            }
        }
        return Math.min(repaints1, repaints2);
    }
}