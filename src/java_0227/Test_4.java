package java_0227;
import java.util.Scanner;

/*請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。例如: 輸入5，輸出: 奇數。輸入6，輸出: 偶數。
*/
public class Test_4 {
    public static void main(String[] args) {
        System.out.println("請輸入任意整數: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? num + "是偶數" : num + "是奇數";
        System.out.println(result);

        sc.close();
    }
}