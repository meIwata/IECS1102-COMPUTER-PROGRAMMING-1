package java_0227;

import java.util.Scanner;
/*請撰寫一程式，計算出輸入之整數除以13的商數與餘數。例如輸入:26，輸出:商數=2，餘數=0 */
public class TestTwo {
    public static void main(String[] args) {
        System.out.println("請輸入數字");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int quotient = num/13;
        System.out.println("商數為: " + quotient);
        int remainder = num%13;
        System.out.println("餘數為: " + remainder);
        sc.close();
    }
}