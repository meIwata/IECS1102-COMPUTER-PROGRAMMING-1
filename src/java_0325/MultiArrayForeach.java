package java_0325;

public class MultiArrayForeach {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        // 增強型for迴圈
        for (int[] i : a) { // 遍歷第一個陣列
            System.out.println("---------------");
            for (int j : i) { // 遍歷第二個陣列
                System.out.println(j);
            }
        }
    }
}
