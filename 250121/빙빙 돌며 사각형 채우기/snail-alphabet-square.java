import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static char [][] arr = new char[MAX_N][MAX_N];
    public static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static int n, m;
    // 동 남 서 북
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int x = 0, y = 0;
    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr[x][y] = 'A';

        for (int i = 1; i < n * m; i++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(!inRange(nx, ny) || arr[nx][ny] != '\u0000') { // 이동조건
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            int idx = (alpha.length() + i) % alpha.length();
            char C = alpha.charAt(idx);
            arr[x][y] = C;
            }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
