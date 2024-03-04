class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = ""+a+b;
        
        int case1 = Integer.parseInt(str1);
        
        if (case1 >= 2*a*b) {
            answer = case1;
        } else {
            answer = 2*a*b;
        }
        
        return answer;
    }
}