import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int X;

    public static void main(String[] args) throws IOException {
        X = Integer.parseInt(br.readLine());

        int line = 1;
        int count = 0;

        while (count + line < X) {
            count += line;
            line++;
        }

        int offset = X - count;

        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = offset;
            denominator = line - offset + 1;
        } else { 
            numerator = line - offset + 1;
            denominator = offset;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
