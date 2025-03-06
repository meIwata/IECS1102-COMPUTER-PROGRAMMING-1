package java_0306;

import java.util.Scanner;

public class iphoneInfoSwitch {
    public static void main(String[] args) {
        System.out.print("請輸入序號中的第四碼 ->");
        Scanner sc = new Scanner(System.in);
        String year = sc.next();
        year = year.toUpperCase();  // 先將字串轉為大寫

        // 使用 Java 14 的 switch 表達式來簡化程式碼
        String result = switch (year) {
            case "M", "N" -> "2014";
            case "P", "Q" -> "2015";
            case "R", "S" -> "2016";
            case "T", "U" -> "2017";
            case "V", "W" -> "2018";
            case "X", "Y" -> "2019";
            default -> "輸入有誤!!!"; 
        };
        System.out.println(result);
        sc.close();
    }
}