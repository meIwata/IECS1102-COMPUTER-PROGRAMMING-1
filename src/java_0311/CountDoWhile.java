package java_0311;

public class CountDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i= " + i);
            System.out.println("這是第" + i + "次執行迴圈");
        } while (i++ < 3); // 在 while() 的結尾要記得加分號！
    }
}
