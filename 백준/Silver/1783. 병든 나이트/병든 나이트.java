import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result;
        if (N == 1) {
            result = 1;
        } else if (N == 2) {
            result = Math.min(4, (M + 1) / 2);
        } else {
            if (M < 7) result = Math.min(4, M);
            else result = M - 2;
        }

        System.out.println(result);
    }
}