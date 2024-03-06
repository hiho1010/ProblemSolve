import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
    
        int last = num_list[num_list.length-1];
        int prev = num_list[num_list.length-2];
        int addit = 0;
        
        if (last > prev) {
            addit = last-prev;
        } else {
            addit = last*2;
        }
        int newArrLength = num_list.length + 1;
        int[] newArr = new int[newArrLength];
        
        
        for( int i = 0; i < newArrLength; i++)  {
            if(i < newArrLength-1) {
                newArr[i] = num_list[i];
            } else {
                newArr[i] = addit;
            }
        }
        
        answer = newArr;
        
        return answer;
    }
}