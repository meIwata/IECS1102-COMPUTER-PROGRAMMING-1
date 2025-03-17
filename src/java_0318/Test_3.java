package java_0318;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入第一個整數: ");
        while (!sc.hasNextInt()) {
            System.out.println("輸入錯誤，請重新輸入");
            sc.next();
        }
        int num1 = sc.nextInt();

        System.out.print("請輸入第二個整數: ");
        int num2;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("輸入錯誤，請重新輸入，必須是整數，請重新輸入第二個數: ");
                sc.next(); // 清除錯誤輸入
            } else {
                num2 = sc.nextInt();
                if (num2 == num1) {
                    System.out.print("第二個數不能與第一個數相同，請重新輸入第二個數: ");
                } else {
                    break; // 輸入正確，跳出迴圈
                }
            }
        }
        int sum = 0;
        if (num1 > num2) {
            for (; num2 <= num1; num2++) {
                sum += num2;
            }
            System.out.println("兩個數字之間的總和: " + sum);
        } else {
            for (; num1 <= num2; num1++) {
                sum += num1;
            }
            System.out.println("兩個數字之間的總和: " + sum);
        }

        sc.close();
    }

}
