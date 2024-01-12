import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        ArrayList<Integer> intList = new ArrayList<>();

        for (int num : arr) {
            intList.add(num);
        }

        ArrayList<Integer> answerList = intList;

        for(int i = 0; i < query.length; i++) {
            if(i%2==0) {
                answerList = new ArrayList<>(answerList.subList(0,query[i]+1));
            } else {
                answerList = new ArrayList<>(answerList.subList(query[i],answerList.size()));
            }
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}