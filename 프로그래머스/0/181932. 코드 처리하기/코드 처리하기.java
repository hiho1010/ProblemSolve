class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        for(int idx = 0; idx < code.length(); idx++){
            if (mode == 0) {
                if (code.charAt(idx) != '1') {
                    if (idx%2 == 0) {
                        ret += code.charAt(idx);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (code.charAt(idx) != '1') {
                    if (idx%2 == 1) {
                        ret += code.charAt(idx);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        if (ret.equals("")) {
            return "EMPTY";
        }
        return ret;
    }
}