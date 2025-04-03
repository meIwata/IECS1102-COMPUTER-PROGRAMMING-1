package java_0403;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("請輸入陣列大小(最高為5): ");
            try {
                int size = sc.nextInt();
                if (size > 0 && size < 5) {
                    Object[] objs = new Object[size];
                    System.out.println("---請輸入 " + size + " 個元素---");
                    for (int i = 0; i < size; i++) {
                        System.out.print("輸入第 " + (i + 1) + " 個元素: ");
                        objs[i] = sc.next();
                    }
                    // 輸出使用者所輸入的陣列內容
                    System.out.print("陣列內容為: ");
                    for (Object obj : objs) {
                        System.out.print(obj);
                        System.out.print(" ");
                    }

                    System.out.println();

                    // 反序列印出使用者所輸入的陣列內容
                    System.out.print("反序陣列內容為: ");
                    for (int i = objs.length - 1; i >= 0; i--) {
                        System.out.print(objs[i]);
                        System.out.print(" ");
                    }
                    break;
                } else { // 檢查非數字範圍
                    System.out.println("輸入有誤，請重新輸入");
                    sc.nextLine();
                }
            } catch (Exception e) { // 檢查數字以外的
                System.out.println("輸入有誤，請重新輸入");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
