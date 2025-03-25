package java_0325;

public class TwoDimArray {
    public static void main(String[] argv) {
        int[][] a = new int[3][4]; // 宣告2維陣列並配置空間

        System.out.println("a裡面有幾個陣列: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["   + i +   "]裡面有幾個元素: " + a[i].length);
        }
    }
}
