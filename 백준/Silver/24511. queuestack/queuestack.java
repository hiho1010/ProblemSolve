import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        StringTokenizer stType = new StringTokenizer(br.readLine());
        StringTokenizer stVal  = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int type = Integer.parseInt(stType.nextToken());
            int v    = Integer.parseInt(stVal.nextToken());
            if (type == 0) dq.addLast(v);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stC = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(stC.nextToken());
            dq.addFirst(x);                
            sb.append(dq.pollLast()).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}