class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for ( int i= 0; i < number.length(); i++) {
            char tmp = number.charAt(i);
            sum += Character.getNumericValue(tmp);
        }
        answer = sum % 9;
        
        return answer;
    }
}