import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String N = br.readLine();
        char[] digits = N.toCharArray();

        Arrays.sort(digits);

        if (digits[0] != '0') {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (char c : digits) {
            sum += (c - '0');
        }

        if (sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse().toString());
    }
}