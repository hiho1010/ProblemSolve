import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] ropes;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());
        ropes = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int maxWeight = 0;
        for (int i = 0; i < n; i++) {
            int weight = ropes[i] * (n - i);
            maxWeight = Math.max(maxWeight, weight);
        }

        System.out.println(maxWeight);
    }
}