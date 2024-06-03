
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;
    static StringBuilder passwords;
    static StringTokenizer st;
    static Map<String, String> memo;

    public static void main(String[] args) throws IOException {
        memo = new HashMap<>();
        passwords = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());    // 16
        m = Integer.parseInt(st.nextToken());    // 4

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();

            memo.put(site, password);
        }
        for (int j = 0; j < m; j++) {
            String targetSite = br.readLine();
            passwords.append(memo.get(targetSite)).append("\n");
        }
        System.out.println(passwords.toString());
    }
}