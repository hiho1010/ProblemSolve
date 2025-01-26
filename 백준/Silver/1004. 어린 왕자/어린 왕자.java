import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int n = scanner.nextInt();

            int count = 0;

            for (int i = 0; i < n; i++) {
                int cx = scanner.nextInt();
                int cy = scanner.nextInt();
                int r = scanner.nextInt();

                boolean startInside = isInside(x1, y1, cx, cy, r);
                boolean endInside = isInside(x2, y2, cx, cy, r);

                if (startInside != endInside) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }

    private static boolean isInside(int x, int y, int cx, int cy, int r) {
        int dx = x - cx;
        int dy = y - cy;
        return dx * dx + dy * dy < r * r;
    }
}