package java_0318;

public class Ex_6b {
    public static void main(String[] args) {
        int sum = 0;
        for (sum = 0; sum < 10; sum++) {
            sum = sum + 1;
            System.out.println(sum); //只執行一次就跳出迴圈
            break;
        }
    }
}
