class Solution {
    public String solution(String my_string, String alp) {
        char[] charArr = new char[my_string.length()];
        char target = alp.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++) {
            charArr[i] = my_string.charAt(i);
            if(charArr[i]==target) {
                charArr[i]=Character.toUpperCase(charArr[i]);
            }
        }
        
        
        return new String(charArr);
    }
}