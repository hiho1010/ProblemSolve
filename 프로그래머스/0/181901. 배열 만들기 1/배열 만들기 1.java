import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            if(i%k==0) {
                intList.add(i);
            }
        }
        Collections.sort(intList);
        
        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}