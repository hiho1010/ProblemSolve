
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static ArrayList<String> dbjList;
    static Map<String, Integer> dbj;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dbj = new HashMap<>();
        dbjList = new ArrayList<>();

        for (int i = 0; i < N+M; i++) {
            String name = br.readLine();
            Integer value = dbj.put(name, dbj.getOrDefault(name,0 ) + 1);
            // 0이 아닌 경우에는 이름을 듣보잡 리스트에 추가해준다.
            if (value != null && value.equals(1)) {
                dbjList.add(name);
            }
        }

        Collections.sort(dbjList);

        System.out.println(dbjList.size());
        for (String name : dbjList) {
            System.out.println(name);
        }
    }
}