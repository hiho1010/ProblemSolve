import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s = br.readLine();
        String[] minusSplit = s.split("-");
        int result = 0;

        result += sumOfGroup(minusSplit[0]);

        for (int i = 1; i < minusSplit.length; i++) {
            result -= sumOfGroup(minusSplit[i]);
        }

        System.out.println(result);
    }

    static int sumOfGroup(String expr) {
        String[] nums = expr.split("\\+");
        int sum = 0;
        for (String num : nums) sum += Integer.parseInt(num);
        return sum;
    }
}
