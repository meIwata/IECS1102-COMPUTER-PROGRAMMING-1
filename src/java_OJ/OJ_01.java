package java_OJ;

import java.util.Scanner;

public class OJ_01 {
    // 使用用陣列來加總數字
    /*
     * 請設計一個程式，可利用陣列儲存資料。使用者會輸入10個整數。
     * 程式依數字所在的位置將這10個數字分為兩組：奇數位數和偶數位數，然後分別計算兩組數字的總和。
     * 最後，輸出這兩組數字的總和。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt(); // 把輸入的整數存進去陣列裡
        }

        int odd = 0;
        for (int i = 0; i < num.length; i += 2) {
            odd += num[i];
        }

        int even = 0;
        for (int j = 1; j < num.length; j += 2) {
            even += num[j];
        }

        System.out.println(odd + "," + even);

        sc.close();
    }
}
