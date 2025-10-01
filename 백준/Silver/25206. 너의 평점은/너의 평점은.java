import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int SUBJECTS = 20;
    static HashMap<String, Double> gradeMap = new HashMap<>();
    static double totalScore = 0.0;
    static double totalCredit = 0.0;

    public static void main(String[] args) throws IOException {
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        for (int i = 0; i < SUBJECTS; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken(); 
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) continue; 

            totalScore += credit * gradeMap.get(grade);
            totalCredit += credit;
        }

        System.out.printf("%.6f\n", totalScore / totalCredit);
    }
}