import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> intList = new ArrayList<>();
        int len = (num_list.length-1)/n + 1;
        for (int i = 0; i < len; i++) {
            intList.add(num_list[i*n]);
        }
        
        
        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}