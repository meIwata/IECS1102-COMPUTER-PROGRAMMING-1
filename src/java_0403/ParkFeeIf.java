package java_0403;

import java.util.Scanner;

public class ParkFeeIf {
    public static void main(String[] args) {
    // int hours = 0;
    // int fee = 0;

    // // 轉換為 int
    // hours = Integer.parseInt(args[0]);

    // if(hours > 6) { // 先計算超過6小時的部分
    //         fee += (hours - 6) * 100;
    //         hours = 6;
    // }

    // if(hours > 4) { // 計算4~6小時的時段
    //         fee += (hours - 4) * 80;
    //         hours = 4;
    // }

    // if(hours > 2) { // 計算2~4小時的時段
    //         fee += (hours - 2) * 50;
    //         hours = 2;
    // }

    // if(hours > 0) { // 計算2小時內的時段
    //         fee += (hours - 0) * 30;
    //         hours = 0;
    // }

    // System.out.println("停車時數：" + args[0] + "小時");
    // System.out.println("應繳費用：" + fee + "元整");





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
