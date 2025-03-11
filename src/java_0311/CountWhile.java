package java_0311;

public class CountWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("i= " + i);
            i++;
            System.out.println("這是第" + i + "次執行迴圈");
        }

        System.out.println("------------------------------------");
        /* 課本寫法 */
        int a = 0; // 宣告用來記錄迴圈執行次數的變數 i
        while (a++ < 3)
            System.out.println("這是第" + a + "次執行迴圈");
    }
}
