class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) < 91) {
                int index = (int)my_string.charAt(i) - 65;
                answer[index]++;
            } else {
                int index = (int)my_string.charAt(i) - 71;
                answer[index]++;
            }
        }
        return answer;
    }
}