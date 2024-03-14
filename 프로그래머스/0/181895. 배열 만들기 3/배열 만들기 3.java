class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int len1 = intervals[0][1] - intervals[0][0] + 1;
        int len2 = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[len1+len2];
        int idx = 0;
        
        for(int i = 0; i < len1; i++) {
            answer[i] = arr[intervals[0][0] + i];
            idx++;
        }
        for(int i = 0; i < len2; i++) {
            answer[i+idx] = arr[intervals[1][0] + i];
        }
        return answer;
    }
}