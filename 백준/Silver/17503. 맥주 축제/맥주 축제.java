import java.io.*;
import java.util.*;

class Beer implements Comparable<Beer> {
    int preference, alcohol;
    
    public Beer(int preference, int alcohol) {
        this.preference = preference;
        this.alcohol = alcohol;
    }

    @Override
    public int compareTo(Beer other) {
        if (this.alcohol == other.alcohol) {
            return other.preference - this.preference;
        }
        return this.alcohol - other.alcohol;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Beer[] beers = new Beer[K];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int preference = Integer.parseInt(st.nextToken());
            int alcohol = Integer.parseInt(st.nextToken());
            beers[i] = new Beer(preference, alcohol);
        }

        Arrays.sort(beers);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int totalPreference = 0;

        for (Beer beer : beers) {
            pq.add(beer.preference);
            totalPreference += beer.preference;

            if (pq.size() > N) {
                totalPreference -= pq.poll();
            }

            if (pq.size() == N && totalPreference >= M) {
                System.out.println(beer.alcohol);
                return;
            }
        }

        System.out.println(-1);
    }
}