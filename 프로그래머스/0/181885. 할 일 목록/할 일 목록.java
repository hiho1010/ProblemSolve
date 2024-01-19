import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = todo_list.length;
        ArrayList<String> unfinList = new ArrayList<String>();
        
        for(int i = 0; i < len; i++) {
            if(finished[i]==false) {
                unfinList.add(todo_list[i]);
            }
        }
        
        String[] answer = unfinList.toArray(new String[0]);
        return answer;
    }
}