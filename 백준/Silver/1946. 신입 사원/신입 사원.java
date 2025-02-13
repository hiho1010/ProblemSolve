import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<int[]> applicants = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int paper = Integer.parseInt(st.nextToken());
                int interview = Integer.parseInt(st.nextToken());
                applicants.add(new int[]{paper, interview});
            }
            
            applicants.sort(Comparator.comparingInt(a -> a[0]));
            
            int count = 1;
            int bestInterview = applicants.get(0)[1];
            
            for (int i = 1; i < n; i++) {
                if (applicants.get(i)[1] < bestInterview) {
                    count++;
                    bestInterview = applicants.get(i)[1];
                }
            }
            
            sb.append(count).append('\n');
        }
        
        System.out.print(sb);
    }
}
