package java_0313;

import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
        while (!sc.hasNextInt()) {
            System.out.print("只允許輸入整數，請輸入整數：");
            sc.next();
        }
        int range = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println("1 到 "+range+" 的所有奇數和為 "+sum);
        sc.close();
    }
}
