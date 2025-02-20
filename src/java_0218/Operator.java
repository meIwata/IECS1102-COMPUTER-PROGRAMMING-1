package java_0218;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // 創建Scanner物件來讀取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入兩個數字
        System.out.println("請輸入兩個整數數字來進行相加:");

        // 讀取第一個數字，並確保輸入有效
        int num1 = 0;
        while (true) {
            System.out.print("請輸入第一個整數: ");
            try {
                num1 = scanner.nextInt();  // 讀取第一個整數
                break;  // 輸入有效，跳出循環
            } catch (Exception e) {
                // 捕獲無效輸入的例外，並顯示錯誤訊息
                System.out.println("錯誤: " + e.getMessage() + "。請輸入有效的整數。");
                scanner.next();  // 清除無效輸入，避免死循環
            }
        }

        // 讀取第二個數字，並確保輸入有效
        int num2 = 0;
        while (true) {
            System.out.print("請輸入第二個整數: ");
            try {
                num2 = scanner.nextInt();  // 讀取第二個整數
                break;  // 輸入有效，跳出循環
            } catch (Exception e) {
                // 捕獲無效輸入的例外，並顯示錯誤訊息
                System.out.println("錯誤: " + e.getMessage() + "。請輸入有效的整數。");
                scanner.next();  // 清除無效輸入，避免死循環
            }
        }

        // 計算兩個數字相加的結果
        int sum = num1 + num2;

        // 輸出相加結果
        System.out.println("兩個數字相加的結果是: " + sum);

        // 關閉Scanner物件
        scanner.close();
    }
}