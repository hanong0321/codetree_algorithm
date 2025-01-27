import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static final int MAX_R  = 5;
    public static final int MAX_C  = 15;

    public static char [][] arr = new char[MAX_R][MAX_C];
    public static int R, C;
    public static int x, y = 0;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();

        for(int i = 0; i < R; i++) {
           for(int j = 0; j < C; j++)
               arr[i][j] = sc.next().charAt(0);
        }

        for(int i = x + 1; i < R - 2; i++) {
            for(int j = y + 1; j < C - 2; j++) {
                if ((arr[x][y] != arr[i][j])) {
                    for (int k = i + 1; k < R - 1; k++) {
                        for (int l = j + 1; l < C - 1; l++) {
                            if (arr[i][j] != arr[k][l] && arr[R - 1][C - 1] != arr[k][j]) cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
