import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String text;
    static int n;
    static int out = 1;

    public static void main(String[] args) throws IOException {
        text = br.readLine();
        n = text.length();
        int check = n / 2;

        for (int i = 0; i < check; i++) {
            int prev = text.charAt(i);
            int next = text.charAt(n - i - 1);
            
            if (prev != next) {
                out = 0;
                break;
            }
        }

        System.out.println(out);
    }
}