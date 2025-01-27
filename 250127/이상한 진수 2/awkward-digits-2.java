import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static int INT_MIN = Integer.MIN_VALUE;;

    public static int maxSum = INT_MIN;
    public static String a;

    public static String change(int idx, char c) {
        StringBuilder sb = new StringBuilder(a);
        sb.setCharAt(idx, c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.next();

        for(int i = 0; i < a.length(); i++) {
            String modified;
            int sum = 0;
            if(a.charAt(i) == '0') {
                modified = change(i, '1');
                sum = Integer.parseInt(modified, 2);
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
