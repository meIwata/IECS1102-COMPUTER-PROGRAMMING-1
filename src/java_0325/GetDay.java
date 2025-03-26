package java_0325;

public class GetDay {
    public static void main(String[] args) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + "月，有" + days[i] + "天");
        }
    }
}
