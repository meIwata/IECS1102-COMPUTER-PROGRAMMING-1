package java_0318;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入長(整數): ");
        while (!sc.hasNextInt()) {
            System.out.print("輸入錯誤，請重新輸入長(整數): ");
            sc.next();
        }
        int length = sc.nextInt();

        System.out.print("請輸入寬(整數): ");
        while (!sc.hasNextInt()) {
            System.out.print("輸入錯誤，請重新輸入寬(整數): ");
            sc.next();
        }
        int width = sc.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
