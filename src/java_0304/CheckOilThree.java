package java_0304;

import java.util.Scanner;

public class CheckOilThree {
    public static void main(String[] args) {
        System.out.println("請輸入目前所剩油量(單位:公升):");
        Scanner scanner = new Scanner(System.in);
        float liter = scanner.nextFloat();


        // if ((liter>=2)|(liter<5)) { //條件其中一個成立就會下去
        // if ((liter >= 2) & (liter < 5)) { //這是一個bug
        //     System.out.println("油量尚足，提醒您注意油表。");

        // }
        // System.out.println("祝您行車愉快");

        // 正確版
        if (liter>=2) {
            System.out.println("油量尚足，提醒您注意油表。");
        }else {
            System.out.println("油量低，請注意!!!");
        }
        System.out.println("祝您行車愉快");

        scanner.close();
    }

}