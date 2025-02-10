import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int count = 0;

        if (N > 0) {
            count = 1;
            long cats = 1;
            while (cats < N) {
                cats *= 2;
                count++;
            }
        }

        System.out.println(count);
    }
}