import java.util.Scanner;

public class Main {
    public static final int MAX_L = 99;

    public static int N;
    public static int T;
    public static int sum = 0;
    public static int [][] arr = new int[MAX_L][MAX_L];
    public static int x, y;
    // 북 동 남 서
    public static int [] dx = { -1, 0, 1, 0 };
    public static int [] dy = {  0, 1, 0, -1 };
    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < N) && (y >= 0 && y < N);
    }
    public static void move(char dir) {
        if(dir == 'L') {
            dirNum = (dirNum + 3) % 4;
        }
        else if(dir == 'R') {
            dirNum = (dirNum + 1) % 4;
        }
        else { // 이동
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(inRange(nx,ny)) {
                x = nx;
                y = ny;
                sum += arr[x][y];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        char [] arr1 = new char[T];
        String cDir = sc.next();

        if (cDir.length() != T) {
            return;
        }
        for(int i = 0; i < T; i++) {
            arr1[i] = cDir.charAt(i);
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 정 가운데 시작
        x = N / 2; y = N / 2;
        sum += arr[x][y];

        for(int i = 0; i < T; i++) {
            move(arr1[i]);
        }
        System.out.println(sum);
    }
}
