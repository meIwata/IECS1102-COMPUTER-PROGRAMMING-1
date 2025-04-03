package java_0401;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = { 23, 54, 33, 5, 7, 46, 99, 35 };
        int temp;

        for (int i = 0; i < data.length - 1; i++) { // 外層迴圈控制排序的輪數
            for (int j = 0; j < data.length - 1 - i; j++) { // 內層迴圈比較相鄰元素
                if (data[j] > data[j + 1]) { // 如果前一個元素大於後一個元素，則交換
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            // 每輪排序後，輸出陣列的狀態
            // System.out.print("第 " + (i + 1) + " 輪排序結果: ");
            // for (int k : data) {
            //     System.out.print(k + " ");
            // }
            // System.out.println();
        }

        // 最終排序結果
        System.out.print("排序後的結果: ");
        for (int k : data) {
            System.out.print(k + " ");
        }
    }
}