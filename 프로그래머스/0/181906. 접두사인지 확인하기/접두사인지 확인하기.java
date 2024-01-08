import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        ArrayList<String> preList = new ArrayList<>();
        int len = my_string.length();
        int answer = 0;
        for (int i = 0; i < len; i++) {
            String subStr = my_string.substring(0,i);
            if(subStr.equals(is_prefix)) {
                answer++;
            }    
        }
        
        return answer;
    }
}