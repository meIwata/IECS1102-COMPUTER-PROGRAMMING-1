package java_0403;

import java.util.Scanner;

public class ParkFeeIf {
    public static void main(String[] args) {
        // int hours = 0;
        // int fee= 0;
        // hours = Integer.parseInt(args[0]); //把輸入在args陣列裡面的序號0轉成Int

        Scanner sc = new Scanner(System.in);
        int hours = 0;
        int fee = 0;

        while (true) {
            System.out.print("請輸入停車時數: ");
            try {
                hours = sc.nextInt();
                if (hours < 0) {
                    System.out.println("停車時數不能為負數，請重新輸入！");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("輸入無效，請輸入一個正整數！");
                sc.nextLine();
            }
        }

        if (hours > 0) { // 計算2小時內
            fee = hours * 30;
        }
        if (hours > 2) { // 計算2~4小時
            fee = 2 * 30 + (hours - 2) * 50; // 基礎費率+超時費率
        }
        if (hours > 4) { // 計算4~6小時
            fee = 2 * 30 + 2 * 50 + (hours - 4) * 80;
        }
        if (hours > 6) { // 計算6小時以上的
            fee = 2 * 30 + 2 * 50 + 2 * 80 + (hours - 6) * 100;
        }
        System.out.println("停車時數: " + hours + " 小時");
        System.out.println("車費: " + fee + "元");
    }
}
