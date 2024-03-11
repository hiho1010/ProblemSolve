import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int len = intStrs.length;
        
        for (int i = 0; i < len; i++) {
            String subStr = intStrs[i].substring(s, s+l);
            int val = Integer.valueOf(subStr);
                       
            if(val > k) {
                list.add(val);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray() ;
        return answer;
    }
}