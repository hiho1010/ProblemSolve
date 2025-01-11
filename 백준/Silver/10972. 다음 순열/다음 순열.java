import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] target;

    private static void solution() throws Exception {
        N = Integer.parseInt(br.readLine());
        target = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        if (findNextPermutation(target)) {
            for (int num : target) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    private static boolean findNextPermutation(int[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        swap(array, i, j);

        reverse(array, i + 1, array.length - 1);

        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}