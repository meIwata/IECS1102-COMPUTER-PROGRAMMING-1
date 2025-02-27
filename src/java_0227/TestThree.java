package java_0227;

import java.util.Scanner;

public class TestThree {
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
            System.out.println("兔有" + rabbit + "隻");
            System.out.println("雞有" + chicken + "隻");
        } else { // 腳一定是偶數
            System.out.println("該數據無解");
        }
        sc.close();
    }
}