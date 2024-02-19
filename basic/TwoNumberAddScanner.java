package basic;

import java.util.Scanner;

public class TwoNumberAddScanner {
    // Scanner 풀이법
    public static void main(String[] args) {
        // 첫째 줄에 A와 B가 주어진다.
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println(a + b);
        
        input.close();
    }
}
