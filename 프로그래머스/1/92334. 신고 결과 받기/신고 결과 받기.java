import java.util.*;

class Solution {
        public static int[] solution(String[] id_list, String[] report, int k) {
        report = new HashSet<>(Arrays.asList(report)).toArray(new String[0]);
        int num = id_list.length;

        int[][] user_relation = new int[num][num];

        for (String r : report) {
            String[] users = r.split(" ");
            int reporterIdx = Arrays.asList(id_list).indexOf(users[0]);
            int reportedIdx = Arrays.asList(id_list).indexOf(users[1]);
            user_relation[reporterIdx][reportedIdx] = 1;
        }

        int[] answer = new int[num];

        for (int c = 0; c < num; c++) {
            int cnt = 0;
            for (int r = 0; r < num; r++) {
                cnt += user_relation[r][c];
                if (cnt >= k) {
                    for (int r2 = 0; r2 < num; r2++) {
                        answer[r2] += user_relation[r2][c];
                    }
                    break;
                }
            }
        }
        return answer;
    }
}