import java.io.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int answer = 1;

        for (int i = 0; i <= (word.length() - 1) / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}