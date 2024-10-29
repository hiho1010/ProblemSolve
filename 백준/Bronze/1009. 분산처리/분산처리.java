import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] abs;
    static final int COMPUTER = 10;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        abs = new int[n][2];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = 1;
            int base = a % COMPUTER;

            for (int j = 0; j < b; j++) {
                result = (result * base) % COMPUTER;
            }

            answer[i] = (result == 0) ? 10 : result;
        }

        for (int res : answer) {
            System.out.println(res);
        }
    }
}