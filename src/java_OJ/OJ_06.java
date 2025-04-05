package java_OJ;

import java.util.Scanner;

public class OJ_06 {
    // 聖誕樹
    /*
     * 輸入n
     * 輸出聖誕樹
     * 由 * 組成聖誕樹
     * 樹葉部分:
     * 高:n
     * 寬:n*2-1
     * 樹幹部分:
     * 3*3
     * 樹葉和樹幹中間要對齊
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5; // 樹葉的高度

        for (int i = 1; i <= n; i++) { // 樹葉的高度 n=5
            // 第一層空格4個 + 星號1個，第二層空格3個+星號3個，第三層空格2個+星號5個，第四層空格1個+星號7個，第五層空格0個+星號9個
            for (int j = 1; j <= n - i; j++) {  
                System.out.print(" ");
            }
            // 第一層星號1個，第二層星號3個，第三層星號5個，第四層星號7個，第五層星號9個
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 輸出樹幹部分
        for (int i = 1; i <= 3; i++) { // 樹幹的高度3
            for (int j = 1; j <= n - 2; j++) { // 空格3個
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) { // 星號3個
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}