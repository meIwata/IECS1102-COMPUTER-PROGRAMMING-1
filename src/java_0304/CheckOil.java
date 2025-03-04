package java_0304;

import java.util.Scanner;

public class CheckOil {
    public static void main(String[] args) {
        System.out.println("請輸入目前所剩油量(單位:公升):");

        Scanner scanner = new Scanner(System.in);
        // int liter = scanner.nextInt(); // 課本用法
        float liter = scanner.nextFloat(); // 油量有可能有小數，使用float會比較好

        if (liter < 2) 
            System.out.println("油量已經不足，該加油了!"); // 有檢查到 會提示這一行
            System.out.println("祝您行車平安"); // 無論如何都會顯示這一行
        
        scanner.close();
    }
}