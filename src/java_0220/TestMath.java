package java_0220;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        float a, b, sum, mul;
        Scanner sc = new Scanner(System.in); // 創建單一 Scanner 物件
        
        System.out.println("請輸入第一個浮點數： ");
        a = sc.nextFloat();

        System.out.println("請輸入第二個浮點數： ");
        b = sc.nextFloat();

        sum = a + b;
        System.out.println("兩數相加為: " + sum);

        mul = a * b;
        System.out.println("兩數相乘為: " + mul);
        
        sc.close(); // 關閉 Scanner 物件
    }
}