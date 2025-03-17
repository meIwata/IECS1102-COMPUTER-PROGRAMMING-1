package java_0318;


public class Test_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1 到 100 之間所有 3 的倍數的總和: " + sum);
    }
}
