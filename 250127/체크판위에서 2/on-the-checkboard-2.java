import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static final int MAX_L = 15;

    public static char[][] arr = new char[MAX_L][MAX_L];
    public static int R, C;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                arr[i][j] = sc.next().charAt(0);
        }

        for (int x1 = 1; x1 < R; x1++) {
            for (int y1 = 1; y1 < C; y1++) {
                if ((arr[0][0] != arr[x1][y1])) { // 첫번째 점프 확인
                    for (int x2 = x1 + 1; x2 < R - 1; x2++) {
                        for (int y2 = y1 + 1; y2 < C - 1; y2++) { 
                            // 두번째 점프 확인
                            if (arr[x1][y1] != arr[x2][y2] && arr[x2][y2] != arr[R - 1][C - 1]) cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
