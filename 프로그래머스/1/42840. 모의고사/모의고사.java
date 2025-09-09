import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) scores[0]++;
            if (answers[i] == supo2[i % supo2.length]) scores[1]++;
            if (answers[i] == supo3[i % supo3.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}