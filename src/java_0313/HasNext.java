package java_0313;

import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
        while (!sc.hasNextInt()) { // 檢查輸入是不是整數，當輸入的不是整數時彈出以下訊息
            System.out.print("只允許輸入整數，請輸入整數：");
            sc.next(); // 清除緩衝區，回去重新輸入
        }
        int range = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                continue; // 是偶數就跳過到下一個迴圈，不執行以下程式碼
            }
            sum = sum + i; // 是奇數才累積
        }
        System.out.println("1 到 " + range + " 的所有奇數和為 " + sum);
        sc.close();
    }
}
