package java_0227;

import java.util.Scanner;

/* 雞兔同籠計算機程式，使用者輸入頭腳分別是多少，程式輸出雞兔各有幾隻。例如: 頭: 8，腳: 26。
輸出為: 雞:3 兔:5。若無解則輸出: "該數據無解"
*/

public class Test_3 {
    public static void main(String[] args) {
        System.out.println("請輸入頭的數量"); // 0兔 20雞
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();

        System.out.println("請輸入腳的數量"); // 40腳
        int foot = sc.nextInt();

        int chicken = 0;
        int rabbit = 0;

        if (foot % 2 == 0) {
            rabbit = (foot / 2) - head;
            chicken = head - rabbit;
            if (rabbit < 0 || chicken < 0) {
                System.out.println("該數據無解");
            } else {
                System.out.println("兔有" + rabbit + "隻");
                System.out.println("雞有" + chicken + "隻");
            }
        } else { // 腳一定是偶數
            System.out.println("該數據無解");
        }
        sc.close();
    }
}