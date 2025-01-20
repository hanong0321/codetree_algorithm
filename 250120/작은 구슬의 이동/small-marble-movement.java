import java.util.Scanner;

public class Main {
    public static final int MAX_N = 50;
    public static final int DIR_NUM = 4;

    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];
    // 동 남 북 서
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};

    public static int t, r, c;


    public static int getDir(char a) {
        if(a == 'R')
            return 0;
        else if(a == 'D')
            return 1;
        else if(a == 'U')
            return 2;
        else
            return 3;
    }
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        int x, y;
        char cDir;
        r = sc.nextInt();
        c = sc.nextInt();
        x = r - 1; y = c - 1;
        cDir = sc.next().charAt(0);

        int moveDir = getDir(cDir);

        for(int i = 1; i <= t; i++) {
            int nx = x + dx[moveDir], ny = y + dy[moveDir];
            if(!inRange(nx, ny)) {
                moveDir = 3 - moveDir; // 방향 변환
                i++; //시간 증가
            }
            x = x + dx[moveDir];
            y = y + dy[moveDir];
        }

        System.out.println((x+1) + " " + (y+1));
    }
}
