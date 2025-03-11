package java_0311;

import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        int sum = 0, range, i;
        System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();

        for (i = 1; i <= range; i += 2) {
            sum += i; // 等同於sum = sum + i，把每一個奇數相加。
        }
        System.out.println("1 到 " + range + " 的所有奇數和為 " + sum);
        sc.close();
    }
}