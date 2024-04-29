
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] strArr;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        strArr = new String[T];

        for (int i = 0; i < T; i++) {
            strArr[i] = br.readLine();
            if (isValid(strArr[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isValid(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') {
                stack.addLast('(');
            } else if (!stack.isEmpty() && stack.peekLast() == '(') {
                stack.removeLast();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
