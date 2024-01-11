import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int s = 0;
        int e = arr.length;
        int cnt = 0;

        for(int i = s; i < arr.length; i++) {
            if(arr[i] == 2) {
                s = i;
                cnt++;
                break;
            }
        }
        for(int i = e-1; i >= 0; i--) {
            if(arr[i] == 2) {
                e = i;
                cnt++;
                break;
            }
        }
        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        } else if (cnt == 1) {
            int[] answer = {2};
            return answer;
        } else {
            int[] answer = Arrays.copyOfRange(arr,s,e+1);
            return answer;
        }
    }
}