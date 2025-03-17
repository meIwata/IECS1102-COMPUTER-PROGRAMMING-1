package java_0313;

public class Ex10 {
    public static void main(String[] args) {
        int i = 0;
        do {
            for (i = 0; i < 10; i++)
                while (i < 4) {
                    System.out.println("*");
                } // 這裡沒有控制迴圈的條件，會無限迴圈
        } while (i < 10);
    }
}
