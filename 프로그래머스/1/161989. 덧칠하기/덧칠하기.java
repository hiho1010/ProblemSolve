class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int i = 0;
        while(section[i] + m -1 < n) {

            int tmp = section[i]+m;
            while(section[i+1] < tmp){
                i++;
            }
            answer++;
            i++;
            if(i >= section.length -1) {
                break;
            }
        }
        return answer;
    }
}