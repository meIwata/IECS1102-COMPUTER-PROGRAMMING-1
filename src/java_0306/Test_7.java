package java_0306;

import java.util.Scanner;

public class Test_7 {
    public static void main(String[] args) {
        System.out.println("請輸入第一個數: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("請輸入第二個數: ");
        int num2 = sc.nextInt();

        System.out.println("要進行的四則運算: 1.加、2.減、3.乘、4.除: ");
        int cal = sc.nextInt();
        if (num2 == 0 && cal == 4) {
            System.out.println("第二個數是分母，分母不能為0，請重新輸入");
            main(args);
        }
        switch (cal) {
            case 1:
                System.out.println("兩數相加: " + (num1 + num2));
                break;
            case 2:
                System.out.println("兩數相減: " + (num1 - num2));
                break;
            case 3:
                System.out.println("兩數相乘: " + (num1 * num2));
                break;
            case 4:
                System.out.println("兩數相除: " + "商數:" + (num1 / num2) + "餘數: " + (num1 % num2));
                break;

            default:
                System.out.println("輸入有誤，請重新輸入!");
                main(args);
                break;
        }
        sc.close();
    }
}
