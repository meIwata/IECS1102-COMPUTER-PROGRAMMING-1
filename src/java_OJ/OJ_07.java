package java_OJ;

import java.util.Scanner;

public class OJ_07 {
    // 數字加密
    /*
     * 讀取⼀四位數，並且依下列⽅式進⾏加密
     * 1. 以該位數加7後，除以 10 取餘數取代該位數
     * 2. 將第⼀個位數的數字與第三個位數的數字對調
     * 3. 將第⼆個位數的數字與第四個位數的數字對調
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int one = (num / 1000) % 10;
        int two = (num / 100) % 10;
        int three = (num / 10) % 10;
        int four = num % 10;

        one = (one + 7)%10;
        two = (two + 7)%10;
        three = (three + 7)%10;
        four = (four + 7)%10;
        
        int temp = one;
        one = three;
        three = temp;

        temp = two;
        two = four;
        four = temp;

        System.out.printf("%d%d%d%d\n", one, two, three, four);

        sc.close();;

    }
}