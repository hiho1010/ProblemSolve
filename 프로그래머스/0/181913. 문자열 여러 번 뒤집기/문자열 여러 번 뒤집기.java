import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] list = my_string.split("");
        int s;
        int e;
        for(int i= 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            for (int start = s, end = e; start < end; start++, end--) {
                String temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
            
        }
        answer = String.join("", list);
        
        return answer;
    }
}