package java_0227;
import java.util.Scanner;

/*假設某自動售票機只能接受10元, 5元及1元的硬幣。請設計一程式，當使用者輸入一小於999的正整數數字時，他所需投入各種幣值硬幣最少的數量分別是多少?
若數字大於999則顯示: 輸入過大。例如使用者輸入: 123，則程式顯示 10元12個，5元0個，1元3個。
*/
public class Test_1 {
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