import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] tmp = {};
        if(n == 1) {
            return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        } else if (n == 4) {
            int len = (slicer[1] - slicer[0])/slicer[2] +1;
            int[] answer = new int[len];
            for (int i =0; i < len; i++) {
                answer[i] = num_list[(slicer[0] + i*slicer[2])];
            }
            return answer;
        }
        return tmp;
    }
}