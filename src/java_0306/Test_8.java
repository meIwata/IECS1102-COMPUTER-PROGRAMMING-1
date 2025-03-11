package java_0306;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        System.out.println("請入性別: 1.男 2.女: ");
        Scanner sc = new Scanner(System.in);
        int gender;
        while (true) {
            gender = sc.nextInt();
            if (gender == 1 || gender == 2) {
                break;
            } else {
                System.out.println("性別輸入有誤，請重新輸入");
            }
        }

        double h;
        while (true) {
            System.out.print("請輸入身高，身高範圍不可低於135，不可高於250: ");
            h = sc.nextDouble();
            if (h > 135 && h < 250) {
                break;
            } else {
                System.out.println("只判斷正常成年人身高，請重新輸入");
            }
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
                break;
        }
        sc.close();
    }
}
