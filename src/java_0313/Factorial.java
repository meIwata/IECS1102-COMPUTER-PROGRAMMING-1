package java_0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("請輸入1~170之間的整數，輸入0結束：");
            System.out.print("(輸入0即結束程式):");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if (num == 0) {
                break;
            } else if (num > 170 || num < 1) {
                System.out.println("輸入錯誤，請輸入1~170之間的整數");
                continue;
            }
            System.out.print(num + "! 等於 ");
            double fact;
            for (fact = 1; num > 0; num--) {
                fact = fact * num;
            }
            System.out.print(fact + "\n\n");
        }
    }
}
