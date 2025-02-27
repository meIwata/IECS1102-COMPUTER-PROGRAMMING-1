package java_0227;

import java.util.Scanner;

public class TestFive {
    public static void main(String[] args) {
        System.out.println("請輸入任意整數: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            // System.out.println(i);
            sum = sum + i;
        }
        System.out.println("輸出: " + sum);
        sc.close();
    }
}
