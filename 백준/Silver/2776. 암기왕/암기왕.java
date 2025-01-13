import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static int T;
    static int note1Count, note2Count;
    static Set<Integer> answerSet;

    private static void solution() throws Exception {

        answerSet = new HashSet<>();
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            note1Count = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < note1Count; i++) {
                answerSet.add(Integer.parseInt(st.nextToken()));
            }

            note2Count = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < note2Count; i++) {
                sb.append(answerSet.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
            }

            answerSet.clear();
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}