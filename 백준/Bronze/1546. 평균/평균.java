import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        

        int n = Integer.parseInt(br.readLine());
        double[] scores = new double[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        double maxScore = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = (scores[i] / maxScore) * 100;
            sum += scores[i];
        }
        double average = sum / n;

        System.out.println(average);
    }
}