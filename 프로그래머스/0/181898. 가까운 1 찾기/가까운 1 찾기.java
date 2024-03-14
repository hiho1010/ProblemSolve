class Solution {
    public int solution(int[] arr, int idx) {
        
        int answer = -1;
        
        while(idx<arr.length) {
            if(arr[idx]==1) {
                answer = idx;
                return answer;
            }
            idx++;
        }
        return answer;
    }
}