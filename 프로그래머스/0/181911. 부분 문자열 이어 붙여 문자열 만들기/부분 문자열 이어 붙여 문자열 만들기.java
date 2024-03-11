import java.util.ArrayList;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        ArrayList<String> list = new ArrayList<>();
        int len = parts.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <len; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            String subStr = my_strings[i].substring(s,e+1);
            sb.append(subStr);
        }
        
        
        String answer = sb.toString();
        
        return answer;
    }
}