import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int bitSet = 0;

    public void solution() throws Exception {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String query = st.nextToken();

            switch (query) {
                case "add":
                    int xAdd = Integer.parseInt(st.nextToken());
                    bitSet |= (1 << (xAdd - 1));
                    break;
                case "remove":
                    int xRemove = Integer.parseInt(st.nextToken());
                    bitSet &= ~(1 << (xRemove - 1));
                    break;
                case "check":
                    int xCheck = Integer.parseInt(st.nextToken());
                    sb.append((bitSet & (1 << (xCheck - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    int xToggle = Integer.parseInt(st.nextToken());
                    bitSet ^= (1 << (xToggle - 1));
                    break;
                case "all":
                    bitSet = (1 << 20) - 1;
                    break;
                case "empty":
                    bitSet = 0;
                    break;
            }
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}