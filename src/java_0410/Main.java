package java_0410;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入成績: ");
        int num = sc.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else if (num >= 0) {
            System.out.println("D");
        }
        sc.close();
    }
}