import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] people = new int[N][2];
        int[] ranks = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int rank = 1; 
            for (int j = 0; j < N; j++) {
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        StringBuilder sb = new StringBuilder();
        for (int rank : ranks) {
            sb.append(rank).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}