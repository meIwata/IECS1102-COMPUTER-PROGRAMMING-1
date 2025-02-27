package java_0227;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        System.out.println("請輸入一個小於999的正整數:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >0 && num <= 999) {
            int a = 10, b = 5, c = 1;

            int result10 = num / a;
            System.out.println("十元需要投: " + result10 + "枚");
            result10 = num % a;
            // System.out.println("剩餘金額: " + result10 + "元");
            
            int result5 = result10 / b;
            System.out.println("五元需要投: " + result5 + "枚");
            result5 = result10 % b;
            // System.out.println("剩餘金額: " + result5 + "元");

            int result1 = result5 / c;
            System.out.println("一元需要投: " + result1 + "枚");        

        } else if(num>999){
            System.out.println("輸入過大");
        } else{
            System.out.println("輸入錯誤");
        }
        sc.close();
    }
}