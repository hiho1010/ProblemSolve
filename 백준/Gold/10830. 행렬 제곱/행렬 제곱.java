import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private long b;
    private int[][] matrix;
    private final int MOD = 1000;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        b = Long.parseLong(st.nextToken());

        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken()) % MOD;
            }
        }

        int[][] result = matrixPower(matrix, b);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private int[][] matrixPower(int[][] matrix, long exp) {
        if (exp == 1) {
            return matrix;
        }

        int[][] half = matrixPower(matrix, exp / 2);
        int[][] halfSquared = matrixMultiply(half, half);

        if (exp % 2 == 0) {
            return halfSquared;
        } else {
            return matrixMultiply(halfSquared, matrix);
        }
    }

    private int[][] matrixMultiply(int[][] a, int[][] b) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}