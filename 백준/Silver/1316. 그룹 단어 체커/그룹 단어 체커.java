import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        HashSet<Character> seen = new HashSet<>();
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch != prev) {
                if (seen.contains(ch)) {
                    return false;
                }
                seen.add(ch);
            }
            prev = ch;
        }
        return true;
    }
}