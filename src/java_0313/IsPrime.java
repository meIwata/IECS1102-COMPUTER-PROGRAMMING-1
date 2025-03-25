package java_0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("請輸入要檢查的數 (輸入 0 結束)： ");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if (num == 0)
                break; // 輸入0就跳出迴圈，結束程式


            /* 質數需>0，1不是質數 */
            else if (num < 0) {
                System.out.println("數值不可小於0，請輸入正整數");
                continue;
            } else if (num == 1) {
                System.out.println("1 不是質數");
                continue; 
            }

            boolean isPrime = true; //宣告布林值，預設是質數
            int range = (num / 2) + (num % 2); // range範圍: 一半 或 一半+1

            for (int i = 2; i <= range; i++) { // 除數範圍: 2 ~ range
                if (num % i == 0) { // num 可被 i 整除
                    if (isPrime) {
                        isPrime = false; // 不是質數的話
                        System.out.print(num + " 不是質數，可被 " + i);
                    } else {
                        System.out.println(" " + i);
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " 是質數");
            } else {
                System.out.println(" 整除");
            }
        }
    }
}
