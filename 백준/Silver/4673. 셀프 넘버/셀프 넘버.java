import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int MAX = 10000;
    static boolean[] generated = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= MAX; i++) {
            int dn = d(i);
            if (dn <= MAX) {
                generated[dn] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= MAX; i++) {
            if (!generated[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}