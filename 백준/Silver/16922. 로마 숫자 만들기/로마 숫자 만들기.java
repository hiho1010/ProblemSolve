import java.util.HashSet;
import java.util.Set;

public class Main {

    static int N;
    static int[] roman = {1, 5, 10, 50};
    static Set<Integer> results = new HashSet<>();

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine());

        dfs(0, 0, 0);
        System.out.println(results.size());
    }

    static void dfs(int depth, int start, int sum) {
        if (depth == N) {
            results.add(sum);
            return;
        }

        for (int i = start; i < 4; i++) {
            dfs(depth + 1, i, sum + roman[i]);
        }
    }
}