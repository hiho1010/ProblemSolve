import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, K;
    static int[] nums;
    static HashSet<String> result;

    public void solution() throws Exception {

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        result = new HashSet<>();
        boolean[] visited = new boolean[N];

        findCombinations(0, visited, new StringBuilder());

        System.out.println(result.size());
    }

    static void findCombinations(int depth, boolean[] visited, StringBuilder current) {
        if (depth == K) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.append(nums[i]);
                findCombinations(depth + 1, visited, current);
                current.delete(current.length() - String.valueOf(nums[i]).length(), current.length());
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}