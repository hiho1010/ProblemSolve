import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(ranks);

        long dissatisfaction = 0;

        for (int i = 0; i < n; i++) {
            dissatisfaction += Math.abs(ranks[i] - (i + 1));
        }

        System.out.println(dissatisfaction);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}