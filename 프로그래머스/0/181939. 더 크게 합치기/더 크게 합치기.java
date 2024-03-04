class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = ""+a;
        String str2 = ""+b;
        
        int case1 = Integer.parseInt(str1+str2);
        int case2 = Integer.parseInt(str2+str1);
        if(case1 > case2) {
            answer = case1;
        }
        if(case1 <= case2) {
            answer = case2;
        }
        return answer;
    }
}