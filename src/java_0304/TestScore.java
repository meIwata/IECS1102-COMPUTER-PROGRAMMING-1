package java_0304;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        System.out.println("請輸入0~100成績");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59){
            System.out.println("未滿60分，不及格!");
        }else{
            System.out.println("輸入錯誤，請重新輸入");
        }
        scanner.close();
    }
}
