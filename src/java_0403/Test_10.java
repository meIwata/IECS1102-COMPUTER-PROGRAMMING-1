package java_0403;

public class Test_10 {
    public static void main(String[] args) {
        int[] a = { 11, 1, 2, 66, 8, 5 };
        for (int i = 0; i < a.length; i++) {
            if (i == a[i]) {
                System.out.println("索引碼: " + i + " = " + "元素值: " + a[i]);
            }
        }
    }
}
