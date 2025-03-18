package java_0318;

public class Ex_6c {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println(sum); // 0 = 0 + 0
            break;
        }
    }
}
