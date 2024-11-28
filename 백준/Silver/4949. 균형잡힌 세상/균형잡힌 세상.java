import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;
            
            if (isBalanced(line)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.print(sb);
        br.close();
    }

    private boolean isBalanced(String line) {
        Stack<Character> stack = new Stack<>();

        for (char ch : line.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
