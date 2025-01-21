import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int [][] arr = new int[MAX_N][MAX_N];
    public static int N;
    // 동 남 서 북 // 0 1 2 3
    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1,  0};
    public static int x = 0, y = 0;
    public static int dirNum = 3;
    public static int time = 0;

    public static boolean move(char cDir) {
        if (cDir == 'L') { // 반시계
            dirNum = (dirNum + 3) % 4;
            time++;

        } else if (cDir == 'R') {
            dirNum = (dirNum + 1) % 4;
            time++;
        } else {
            // 이동
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
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!move(ch)) {
                System.out.println(time);
                return;
            }
        }


    }
}
