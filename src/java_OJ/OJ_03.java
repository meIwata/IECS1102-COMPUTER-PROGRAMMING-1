package java_OJ;

import java.util.Scanner;

public class OJ_03 {
    // 星座查詢
    /*
     * 1997年 1⽉ 21⽇ ~ 1997年 2⽉ 18⽇ ⽔瓶 ( Aquarius)
     * 1997年 2⽉ 19⽇ ~ 1997年 3⽉ 20⽇ 雙⿂ (Pisces)
     * 1997年 3⽉ 21⽇ ~ 1997年 4⽉ 20⽇ 牡⽺ (Aries)
     * 1997年 4⽉ 21⽇ ~ 1997年 5⽉ 21⽇ ⾦⽜ (Taurus)
     * 1997年 5⽉ 22⽇ ~ 1997年 6⽉ 21⽇ 雙⼦ (Gemini)
     * 1997年 6⽉ 22⽇ ~ 1997年 7⽉ 22⽇ 巨蟹 (Cancer)
     * 1997年 7⽉ 23⽇ ~ 1997年 8⽉ 23⽇ 獅⼦ (Leo)
     * 1997年 8⽉ 24⽇ ~ 1997年 9⽉ 23⽇ 處⼥ (Virgo)
     * 1997年 9⽉ 24⽇ ~ 1997年 10⽉ 23⽇ 天秤 (Libra)
     * 1997年10⽉ 24⽇ ~ 1997年 11⽉ 22⽇ 天蠍 (Scorpio)
     * 1997年11⽉ 23⽇ ~ 1997年 12⽉ 21⽇ 射⼿ (Sagittarius)
     * 1997年12⽉ 22⽇ ~ 1998年 1⽉ 20⽇ 摩羯 (Capricorn)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if ((m == 1 && d >= 21) || (m == 2 && d <= 18)) {
            System.out.println("Aquarius");
        } else if ((m == 2 && d >= 19) || (m == 3 && d <= 20)) {
            System.out.println("Pisces");
        } else if ((m == 3 && d >= 21) || (m == 4 && d <= 20)) {
            System.out.println("Aries");
        } else if ((m == 4 && d >= 21) || (m == 5 && d <= 21)) {
            System.out.println("Taurus");
        } else if ((m == 5 && d >= 22) || (m == 6 && d <= 21)) {
            System.out.println("Gemini");
        } else if ((m == 6 && d >= 22) || (m == 7 && d <= 22)) {
            System.out.println("Cancer");
        } else if ((m == 7 && d >= 23) || (m ==  8 && d <= 23)) {
            System.out.println("Leo");
        } else if ((m == 8 && d >= 24 ) || (m == 9 && d <= 23 )) {
            System.out.println("Virgo");
        } else if ((m == 9 && d >= 24) || (m == 10 && d <= 23)) {
            System.out.println("Libra");
        } else if ((m == 10 && d >= 24) || (m == 11 && d <= 22 )) {
            System.out.println("Scorpio");
        } else if ((m == 11 && d >= 23 ) || (m == 12 && d <=21 )) {
            System.out.println("Sagittarius");
        } else if ((m == 12 && d >= 22) || (m == 1 && d <= 20 )) {
            System.out.println("Capricorn");
        }
        sc.close();
    }
}
