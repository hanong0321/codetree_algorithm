import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String binaryStr = sc.next();
        sc.close();

        int maxDecimalValue = Integer.MIN_VALUE;
     
        for (int i = 0; i < binaryStr.length(); i++) {
            char[] modifiedBinary = binaryStr.toCharArray();
       
            modifiedBinary[i] = (modifiedBinary[i] == '0') ? '1' : '0';

            int decimalValue = Integer.parseInt(new String(modifiedBinary), 2);

            if (decimalValue > maxDecimalValue) {
                maxDecimalValue = decimalValue;
            }
        }

        System.out.println(maxDecimalValue);
    }
}
