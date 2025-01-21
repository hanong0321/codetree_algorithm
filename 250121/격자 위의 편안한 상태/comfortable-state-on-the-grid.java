import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int [][] arr = new int[MAX_N][MAX_N];
    public static int N, M;
    // 동 남 서 북 // 0 1 2 3
    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1,  0};
    // public static int dirNum = 0;
    public static int x, y;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    public static void chk(int x, int y) {

        arr[x][y] = 1; // 색칠 직후 확인

        int cnt = 0;
        for(int dirNum = 0; dirNum < 4; dirNum++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            // System.out.println(nx + " " + ny);
            if(inRange(nx, ny) && arr[nx][ny] == 1) {
                cnt++;
            }
        }
        if(cnt == 3) {
            System.out.println(1);
        }
        else System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            chk(x - 1, y - 1);
        }
    }
}
