class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        int back = len - n;
        
        String answer = my_string.substring(back, len);
        
        return answer;
    }
}