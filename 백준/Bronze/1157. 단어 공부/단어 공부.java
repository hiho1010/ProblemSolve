import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws Exception {
        String word = br.readLine().toUpperCase();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alphabetCount[c - 'A']++;
        }

        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                result = '?';
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}