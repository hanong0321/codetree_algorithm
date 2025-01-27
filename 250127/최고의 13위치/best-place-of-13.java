import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static final int MAX_L  = 20;

    public static int [][] arr = new int[MAX_L][MAX_L];
    public static int N;
    public static int maxCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
           for(int j = 0; j < N; j++) {
               arr[i][j] = sc.nextInt();
           }
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N - 2; j++) {
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
            }
        }
        System.out.println(maxCnt);
    }
}
