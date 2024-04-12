
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String text;
    static String pattern;
    static int cnt = 0;
    static int i = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        text = br.readLine();
        pattern = br.readLine();
        int t = text.length();
        int p = pattern.length();

        while (i < t-p+1) { // 만약 문자가 5이고 패턴이 3이면 최대 3회 봐야함.
            int startIdx = i; // 시작점을 i로 하고
            boolean flag = true; // flag 설정
            for (int j = 0; j < p; j++) { // 하나씩 타겟을 순회하면서
                if (pattern.charAt(j) != text.charAt(startIdx)) { // 단 하나라도 틀린걸 찾으면?
                    i += 1; // 스타트지점을 일단 하나 밀고
                    flag = false; // 브레이크 밟아버렸다고 표시하고
                    break; // 즉시 브레이크
                } else {
                    startIdx += 1; // 같으면 일단 그 다음걸 비교해본다
                }
            }

            if (flag) { // 브레이크를 안밟았다는 소리는?
                cnt += 1; // 실제로 찾았단 소리니까 더해주고
                i += p; // 중복을 피하기 위하여 시작점을 타겟 길이만큼 밀어버린다.
            }
        }
        System.out.println(cnt);
    }
}