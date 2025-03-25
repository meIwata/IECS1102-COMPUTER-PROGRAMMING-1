package java_0325;

public class MultiArrayInit {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        System.out.println("a共有" + a.length + "個元素");

        for (int i = 0; i < a.length; i++) {
            System.out.println("---------------------");
            System.out.println("a[" + i + "]共有" + a[i].length + "個元素");
            
            // 把每一個二維陣列的元素印出來
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);
            }
        }
    }
}
