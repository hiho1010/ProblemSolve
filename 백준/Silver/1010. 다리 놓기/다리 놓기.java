
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 서쪽 사이트 수
            int m = Integer.parseInt(st.nextToken()); // 동쪽 사이트 수

            sb.append(combination(m, n)).append("\n");
        }

        System.out.print(sb);
    }

    // 조합 계산 함수
    private long combination(int m, int n) {
        if (n > m / 2) n = m - n; // C(m, n) = C(m, m-n) -> 계산 최적화
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}