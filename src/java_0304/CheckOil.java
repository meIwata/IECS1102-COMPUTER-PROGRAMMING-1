package java_0304;

import java.util.Scanner;

public class CheckOil {
    public static void main(String[] args) {
        System.out.println("請輸入目前所剩油量(單位:公升):");

        Scanner scanner = new Scanner(System.in);
        int liter = scanner.nextInt();

        if (liter < 2) {
            System.out.println("油量已經不足，該加油了!");
        } else {
            System.out.println("祝您行車平安");
        }
        scanner.close();
    }
}