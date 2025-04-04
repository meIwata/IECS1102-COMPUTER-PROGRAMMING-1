package java_OJ;

import java.util.Scanner;

public class OJ_09 {
    // 判斷是否為迴文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ary1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ary1[i] = str.charAt(i);
        }
        // System.out.print("正序: ");
        // for (char x : ary1) {
        //     System.out.print(x);
        // }

        // System.out.println("");

        char[] ary2 = new char[str.length()];
        for (int j = str.length() - 1; j >= 0; j--) {
            ary2[j] = str.charAt(str.length() - 1 - j);
        }
        // System.out.print("反序: ");
        // for (char y : ary2) {
        //     System.out.print(y);
        // }

        Boolean isSame = true;
        for (int k = 0; k < str.length(); k++) {
            if (ary1[k] != ary2[k]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
