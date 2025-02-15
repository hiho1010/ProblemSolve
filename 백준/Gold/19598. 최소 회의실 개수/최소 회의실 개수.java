import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<int[]> events = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            events.add(new int[]{start, 1});
            events.add(new int[]{end, -1});
        }
        
        events.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        int maxRooms = 0, currentRooms = 0;
        
        for (int[] event : events) {
            currentRooms += event[1];
            maxRooms = Math.max(maxRooms, currentRooms);
        }
        
        System.out.println(maxRooms);
    }
}
