class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        int ineqInt = (int)ineq.charAt(0);
        int eqInt = (int)eq.charAt(0);
        
        if (ineqInt == 60 ) {
            if (eqInt == 61) {
                if(n <= m) {
                    answer = 1;
                } else {
                    answer =0;
                }
            } else {
                if(n < m) {
                    answer = 1;
                } else {
                    answer =0;
                }
            }
        } else {
            if (eqInt == 61) {
                if(n >= m) {
                    answer = 1;
                } else {
                    answer =0;
                }
            } else {
                if(n > m) {
                    answer = 1;
                } else {
                    answer =0;
                }
            }
        }
        
        return answer;
    }
}