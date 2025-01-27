import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static String str;
    public static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.next();
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                for(int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(j) == ')') cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
