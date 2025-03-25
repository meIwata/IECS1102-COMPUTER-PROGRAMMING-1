package java_0325;

public class TwoDimArrayAlloc {
    public static void main(String[] args) {
        int[][] a = new int[3][]; // 第一個[]必須明確指明有幾個，第二個[]可留白
        System.out.println("a裡面有幾個元素: " + a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[4]; // 配置第二個[]的空間
            System.out.println("a[" + i + "]裡面有幾個元素: " + a[i].length);
        }

        System.out.println("----------------------------------------------");

        int[][]x = new int[3][];
        int[][][]y = new int[4][][];

        System.out.println("x裡面有幾個元素: " + x.length);
        System.out.println("y裡面有幾個元素: " + y.length);

    }
}
