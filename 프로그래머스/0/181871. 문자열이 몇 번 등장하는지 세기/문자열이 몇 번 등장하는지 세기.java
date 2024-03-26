class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        int strLen = myString.length();
        
        for(int i = 0; i < strLen-patLen+1; i++) {
            String sub = myString.substring(i,i+patLen);
            if(sub.equals(pat)) {
                answer++;
            }
        }
        
    
        return answer;
    }
}