package java_0227;

import java.util.Scanner;

/*請設計一程式，從使用者得到一大於0的整數數字n，輸出1+2+3+...n之結果。例如輸入:5，輸出:15。 */
public class TestFive {
    public static void main(String[] args) {
        System.out.println("請輸入任意整數: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            // System.out.println(i);
            sum = sum + i;
        }
        System.out.println("輸出: " + sum);
        sc.close();
    }
}
