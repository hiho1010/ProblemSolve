import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, K;
    static int[] arr, tmp;
    static int count = 0;
    static int result = -1;

    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) tmp[t++] = arr[i++];
            else tmp[t++] = arr[j++];
        }
        while (i <= mid) tmp[t++] = arr[i++];
        while (j <= right) tmp[t++] = arr[j++];

        i = left; t = 0;
        while (i <= right) {
            arr[i] = tmp[t];
            count++;
            if (count == K) result = arr[i];
            i++; t++;
        }
    }

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N - 1);
        System.out.println(result);
    }
}