
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, sum, tmp;
    static int[] p;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        p = new int[n];
        sum = 0;
        tmp = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        for (int i = 1; i < n+1; i++) {
            tmp = tmp + p[i-1];
            sum += tmp;
        }
        System.out.println(sum);
    }

}
