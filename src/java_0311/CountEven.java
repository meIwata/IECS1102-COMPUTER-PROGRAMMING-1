package java_0311;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountEven {
    public static void main(String[] args) throws IOException {
        int sum = 0, range;

        System.out.print("請輸入欲計算的偶數和範圍(結尾數值)：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        range = Integer.parseInt(str);

        int i = 0;
        while (i <= range) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("1 到 " + range + " 的所有偶數和為 " + sum);
    }
}
