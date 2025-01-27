import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static final int MAX_L  = 100;

    public static int [] arr = new int[MAX_L];
    public static int N;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if(arr[i] <= arr[j] && arr[j] <= arr[k]) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
