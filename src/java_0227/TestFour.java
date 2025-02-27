package java_0227;

import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        System.out.println("請輸入任意整數: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? num + "是偶數" : num + "是奇數";
        System.out.println(result);

        sc.close();
    }
}
