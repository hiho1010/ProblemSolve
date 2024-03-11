import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> sufList = new ArrayList<>();
        int len = my_string.length();
        
        for (int i = 0; i < len; i++) {
            String subStr = my_string.substring(i, len);
            sufList.add(subStr);
        }
        Collections.sort(sufList);
        String[] answer = sufList.stream().toArray(String[]::new);
        return answer;
    }
}