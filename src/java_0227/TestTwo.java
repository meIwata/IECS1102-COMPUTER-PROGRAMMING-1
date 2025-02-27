package java_0227;

import java.util.Scanner;

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