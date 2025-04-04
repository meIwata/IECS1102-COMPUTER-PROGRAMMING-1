package java_OJ;

import java.util.Scanner;

public class OJ_10 {
    // 計算總和、乘積、差、商和餘數
    /*
     * 撰寫⼀個程式，要求使⽤者輸⼊兩個數字，再從使⽤者取得這兩個數字，然後印出這兩個數字的總和、乘積、差、商、和餘數。
     * 依序輸⼊兩個整數(int)，整數範圍不超過 1000 。
     * 輸出總和(int)、乘積(int)、差(int)、商(int)和餘數(int)(注意格式)，最後必須有換⾏字元。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + "..." + (num1 % num2));

        sc.close();
    }
}
