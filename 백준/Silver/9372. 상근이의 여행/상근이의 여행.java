import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T, N, M;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); 
            M = Integer.parseInt(st.nextToken()); 

            for (int i = 0; i < M; i++) {
                br.readLine();
            }

            sb.append(N - 1).append("\n");
        }

        System.out.print(sb);
    }
}