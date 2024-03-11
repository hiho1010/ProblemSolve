import java.util.Collections;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String subStr = my_string.substring(s,e+1);
        StringBuilder sb2 = new StringBuilder(subStr);
    
        sb2.reverse();
        String insertStr = sb2.toString();
        sb.delete(s,e+1);
        sb.insert(s,insertStr);
        
        String answer = sb.toString();
        return answer;
    }
}