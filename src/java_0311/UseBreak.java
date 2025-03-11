package java_0311;

public class UseBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            System.out.println("無窮迴圈執行中...");
            if (i == 5) {
                break;
            }
            i++;
        }
        System.out.println("跳脫迴圈成功");
    }
}
