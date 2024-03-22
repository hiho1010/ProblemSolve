class Solution {
    public String solution(String myString) {
        char[] charArr = new char[myString.length()];
        for(int i = 0; i < myString.length(); i++) {
            charArr[i] = myString.charAt(i);
            if(charArr[i]==97) {
                charArr[i]=Character.toUpperCase(charArr[i]);
            } else if(charArr[i]>65 && charArr[i]<=90){
                charArr[i]=Character.toLowerCase(charArr[i]);
            }
            
        }
        return new String(charArr);
    }
}