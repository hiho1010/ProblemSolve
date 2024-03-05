class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for (int num : num_list) {
            mul = mul * num;
        }
        for (int num : num_list) {
            sum += num;
        }
        sum = sum*sum;
        
        answer = (mul<sum)? 1:0;
        
        
        return answer;
    }
}