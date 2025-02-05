import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static char[] signs;   // 부등호 배열
    static boolean[] visited = new boolean[10]; // 숫자 방문 여부
    static String minAns = "", maxAns = ""; // 최솟값과 최댓값 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        signs = new char[k];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            signs[i] = st.nextToken().charAt(0);
        }

        // 0~9 숫자로 DFS 탐색
        for (int i = 0; i < 10; i++) {
            visited[i] = true;
            dfs(0, i, String.valueOf(i));
            visited[i] = false;
        }

        System.out.println(maxAns);
        System.out.println(minAns);
    }

    static void dfs(int depth, int prevNum, String currentSeq) {
        if (depth == k) { // 부등호 조건을 모두 만족하면 종료
            if (minAns.isEmpty()) minAns = currentSeq; // 처음 저장되는 값이 최소값
            maxAns = currentSeq; // 마지막 저장되는 값이 최대값
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                if (check(prevNum, i, signs[depth])) {
                    visited[i] = true;
                    dfs(depth + 1, i, currentSeq + i);
                    visited[i] = false; // 백트래킹
                }
            }
        }
    }

    static boolean check(int a, int b, char sign) {
        return (sign == '<') ? a < b : a > b;
    }
}