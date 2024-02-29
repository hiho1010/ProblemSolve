import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chars = a.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char tmp;
            if (chars[i] > 96) {
                tmp = Character.toUpperCase(chars[i]);
            } else {
                tmp = Character.toLowerCase(chars[i]);
            }
            chars[i] = tmp;
        }

        String result = new String(chars);
        System.out.println(result);
    }
}