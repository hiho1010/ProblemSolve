import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> sufList = new ArrayList<>();
        int len = my_string.length();
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            String subStr = my_string.substring(i,len);
            if (subStr.equals(is_suffix)) {
                cnt++;
            }
        }
        
        int answer = cnt;
        return answer;
    }
}