import java.util.*;

class Solution {
    static int max, min;
    static StringTokenizer st;
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        st = new StringTokenizer(s);
        max = Integer.parseInt(st.nextToken());
        min = max;
        
        while(st.hasMoreTokens()) {
            int t = Integer.parseInt(st.nextToken());
            max = Math.max(max, t);
            min = Math.min(min, t);
        }
        
        answer.append(min).append(" " + max);
        return answer.toString();
    }
}