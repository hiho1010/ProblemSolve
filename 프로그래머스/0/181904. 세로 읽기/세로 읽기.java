import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length()/m;
        char[][] charArr = new char[len][m];
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < len; i++){
            for (int j  = 0; j < m; j ++) {
                charArr[i][j] = my_string.charAt(i*m+j);
            }
            sb.append(charArr[i][c-1]);
        }
        String answer = sb.toString();
        return answer;
    }
}