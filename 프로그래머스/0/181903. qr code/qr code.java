import java.util.ArrayList;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> intList = new ArrayList<>();
        int len = code.length();
        
        for (int i=0; i <len; i++) {
            if(i%q == r) {
                sb.append(code.charAt(i));
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}