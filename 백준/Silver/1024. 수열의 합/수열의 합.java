import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int L = Integer.parseInt(tokenizer.nextToken());

        boolean found = false;
        int start = 0; 
        int length = 0;

        for (int len = L; len <= 100; len++) {
            int temp = N - (len * (len - 1)) / 2;
            if (temp < 0) break;

            if (temp % len == 0) {
                start = temp / len;
                length = len;
                found = true;
                break;
            }
        }

        if (found) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < length; i++) {
                result.append(start + i).append(" ");
            }
            System.out.println(result.toString().trim());
        } else {
            System.out.println(-1);
        }
    }
}