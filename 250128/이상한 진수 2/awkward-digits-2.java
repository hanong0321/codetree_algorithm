import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static int maxSum;
    public static String a;

    public static String change(int idx, char c) {
        return a.substring(0, idx) + c + a.substring(idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.next();
        maxSum = Integer.parseInt(a, 2);

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '0') {
                String modified = change(i, '1');
                int sum = Integer.parseInt(modified, 2);
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }
}