import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int [][] arr = new int[MAX_N][MAX_N];
    public static int N;
    // 동 남 서 북
    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1,  0};
    public static int x = 0, y = 0;
    public static int dirNum = 3;
    public static int time = 0;

    public static boolean move(int len, char cDir) {
        if (cDir == 'E') {
            dirNum = 0;
        }
        else if(cDir == 'S') {
            dirNum = 1;
        }
        else if(cDir == 'W') {
            dirNum = 2;
        }
        else { // N
            dirNum = 3;
        }

        for(int i = 0; i < len; i++) {
            x += dx[dirNum];
            y += dy[dirNum];
            time++;
            if(x == 0 && y == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int len;
        char cDir;

        for(int i = 0; i < N; i++) {
            cDir = sc.next().charAt(0);
            len = sc.nextInt();

            if(!move(len, cDir)) {
                System.out.println(time);
                return;
            }
        }
    }
}
