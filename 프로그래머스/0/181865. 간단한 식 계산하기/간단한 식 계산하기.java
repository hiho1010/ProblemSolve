class Solution {
    public int solution(String binomial) {
        
        String[] strArr = binomial.split("[\\+\\-\\*]");
        int answer = 0;
        
        if (binomial.contains("+")) {
            answer = Integer.valueOf(strArr[0].trim()) + Integer.valueOf(strArr[1].trim());
        }
        else if (binomial.contains("-")) {
            answer = Integer.valueOf(strArr[0].trim()) - Integer.valueOf(strArr[1].trim());
        }
        else if (binomial.contains("*")) {
            answer = Integer.valueOf(strArr[0].trim()) * Integer.valueOf(strArr[1].trim());
        }
        return answer;
    }
}
