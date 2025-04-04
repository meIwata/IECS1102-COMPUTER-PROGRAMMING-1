package java_OJ;

import java.util.Scanner;

public class OJ_05 {
    // 成績分類_判斷式
    /*
     * 請讓使用者輸入一個分數
     * 如果大於等於60請輸出pass
     * 若是90分以上，請額外輸出excellent
     * 50~59請輸出almost pass
     * 否則輸出fail
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 49) {
            System.out.println("fail");
        }
        if (num >= 50 && num < 60) {
            System.out.println("almost pass");
        }
        if (num >= 60) {
            System.out.println("pass");
        }
        if (num >= 90) {
            System.out.println("excellent");
        }

        sc.close();
    }
}
