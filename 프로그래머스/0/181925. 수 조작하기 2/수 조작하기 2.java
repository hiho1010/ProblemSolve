class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int len = numLog.length - 1;
        int check = 0;
        char[] charArr = new char[len];
        
        for (int i =0; i < len; i++) {
            check = numLog[i+1] - numLog[i];
            if(check == 1) {
                charArr[i] = 'w';
            } else if(check == -1) {
                charArr[i] = 's';
            } else if(check == 10) {
                charArr[i] = 'd';
            }else {
                charArr[i] = 'a';
            }
        }
        
        answer = new String(charArr);
        
        return answer;
    }
}