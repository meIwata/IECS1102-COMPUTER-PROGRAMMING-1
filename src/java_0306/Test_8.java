package java_0306;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        System.out.println("請入性別: 1.男 2.女: ");
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        if (gender != 1 && gender != 2) {
            System.out.println("輸入有誤，請重新輸入");
            main(args);
        }
        System.out.println("請輸入身高: ");
        double h = sc.nextDouble();
        if (h < 135 || h > 250) {
            System.out.println("只判斷正常成年人身高，請重新輸入");
            main(args);
        }
        switch (gender) {
            case 1:
                System.out.println("男生標準體重: " + (h - 80) * 0.7 + "公斤");
                break;
            case 2:
                System.out.println("女生標準體重: " + (h - 70) * 0.6 + "公斤");
                break;
            default:
                System.out.println("輸入有誤，請重新輸入!!!!!!!!!!!");
                main(args);
                break;
        }
        sc.close();
    }
}
