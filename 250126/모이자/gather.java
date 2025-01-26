import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_L = 100;
    public static int [] arr = new int [MAX_L];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDis = INT_MAX;
        for(int i = 0; i < n; i++) {
            int disSum = 0;
            for(int j = 0; j < n; j++) {
                disSum += arr[j] * abs(i - j);
            }
            if(disSum < minDis) {
                minDis = disSum;
            }
        }
        System.out.println(minDis);
    }

}
