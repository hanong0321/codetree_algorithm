import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static boolean check(int [][] arr, int x, int y, int n) {
        int cnt = 0;
        int [] dx = new int[] {-1, 0, 1, 0}; // 북 동 남 서
        int [] dy = new int[] {0, 1, 0, -1};
        for (int dirNum = 0; dirNum < 4; dirNum++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(inRange(nx, ny, n) && arr[nx][ny] == 1)
                cnt++;
        }
        return cnt >= 3;
    }

    public static boolean check_range(int n) {
        return (n >= 1&& n <= 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 100) {
            System.exit(0);
            // return;
        }

        int [][] arr = new int[n][n];
        
        int total_cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(check(arr, i, j, n)) 
                    total_cnt++;
            }
        }
        System.out.println(total_cnt);
    }
}
