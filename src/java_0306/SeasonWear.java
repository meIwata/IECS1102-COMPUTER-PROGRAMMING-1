package java_0306;

import java.util.Scanner;

public class SeasonWear {
    public static void main(String[] args) {
        System.out.println("請輸入月份: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        // 使用了 Java 14 引入的 switch 表達式。這種 switch表達式不需要 break 語句來終止每個分支，因為它們是表達式而不是語句。每個分支使用->來指示結果，並且 switch 表達式會自動返回該結果。
        String season = switch (month) {
            case 11, 12, 1 -> "冬";
            case 2, 3, 4 -> "春";
            case 5, 6, 7 -> "夏";
            case 8, 9, 10 -> "秋";
            default -> "輸入錯誤";
        };
        System.out.println("是"+season+"天");
        sc.close();
    }
}