package java_0220;

import java.util.Scanner;

public class ModInput {
    public static void main(String[] args) {
        int apple, people = 7, q, r;
        System.out.println(people + "個人分蘋果，要分幾個蘋果？");
        Scanner sc = new Scanner(System.in);
        apple = sc.nextInt();
        q = apple / people;
        r = apple % people;

        System.out.println(people + "人分" + apple + "個蘋果,");
        System.out.println("每人分" + q + "個， 還剩" + r + "個");

    }
}