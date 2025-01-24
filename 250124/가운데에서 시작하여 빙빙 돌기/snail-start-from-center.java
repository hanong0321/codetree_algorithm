import java.util.Scanner;

public class Main {
    public static final int MAX_L = 100;

    public static int N;
    public static int [][] arr = new int[MAX_L][MAX_L];
    public static int x, y;
    // 서 북 동 남
    public static int [] dx = { 0, -1, 0, 1 };
    public static int [] dy = { -1, 0, 1, 0 };
    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < N) && (y >= 0 && y < N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        x = N-1; y = N-1;
        arr[x][y] = N*N;
        for(int i = N*N - 1; i > 0; i--) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(!inRange(nx,ny) || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }
            x += dx[dirNum]; y += dy[dirNum];
            arr[x][y] = i;
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
