package java_0318;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入第一次密碼(4個數字): ");
        // int num1 = sc.nextInt();
        String num1 = sc.next();
        while (num1.length() != 4) {
            System.out.println("密碼長度有誤!");
            System.out.print("請重新輸入第一次密碼(4個數字): ");
            num1 = sc.next();
        }

        int count = 0;
        while (true) {
            System.out.print("請再次輸入密碼(4個數字): ");
            // int num2 = sc.nextInt();
            String num2 = sc.next();
            while (num2.length() != 4) {
                System.out.println("密碼長度有誤!");
                System.out.print("請重新輸入第二次密碼(4個數字): ");
                num2 = sc.next();
            }
            count++;

            if (num1.equals(num2)) { // 比較兩個值是否相等
                System.out.println("成功登入");
                break;
            } else {
                System.out.println("登入失敗，請再次輸入!" + "你已嘗試了:" + count + "次");
                if(count>=3){
                    System.out.println("已經嘗試3次了! 請晚一點再回來嘗試!!!");
                    break;
                }
            }
        }
        sc.close();
    }
}
