package java_0304;

import java.util.Scanner;

public class CheckOilElse {
    public static void main(String[] args) {
        System.out.println("請輸入目前所剩油量(單位:公升):");
        Scanner scanner = new Scanner(System.in);
        float liter = scanner.nextFloat();
        
    if (liter < 2) { // 條件 1
        // 敘述 1
        System.out.println("油量已經不足, 該去加油了！");
      }
      else if (liter < 10) { // 條件 2
        // 敘述 2
        System.out.println("油量尚足, 提醒您注意油表。");
      }
      else {  // 前面所有條件都不成立時
        // 敘述 3
        System.out.println("油量充足, 請安心上路");
      }
  
      System.out.println("祝您行車愉快。");
      scanner.close();
    }
}

