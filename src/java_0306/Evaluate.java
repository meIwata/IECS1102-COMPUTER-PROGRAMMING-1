package java_0306;

import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args) {
        System.out.println("請輸入年度考績: 優、甲、乙、丙");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        switch (grade) {
            case "優":
                System.out.println("出國玩");
                break;
            case "甲":
                System.out.println("可以買手機");
                break;
            case "乙":
                System.out.println("可以去逛街");
                break;
            case "丙":
                System.out.println("準備轉職");
                break;
            default:
                System.out.println("輸入錯誤!");
                break;
        }
        sc.close();
    }
}
