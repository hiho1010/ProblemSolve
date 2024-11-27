import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] temperatures = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += temperatures[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < n; i++) {
            currentSum = currentSum - temperatures[i - k] + temperatures[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}