package java_0403;

public class Test_3 {
    public static void main(String[] args) {
        int[] data = { 23, 54, 33, 5, 7, 46, 99, 35 };
        // System.out.println("元素長度: " + data.length);
        int temp;

        
        // 將陣列裡面的資料由大排到小
        for (int i = 0; i < data.length; i++) { // i最高到7
            for (int j = 0; j < data.length - 1 - i; j++) { // 從索引 0 開始比較到 data.length - 1 - i
                if (data[j] < data[j + 1]) {
                    temp = data[j]; // 先把值抽出來放在temp
                    data[j] = data[j + 1]; // 把自己的位置data[j] 讓給data[j+1]
                    data[j + 1] = temp; // 再把自己temp放回到data[j+1]
                }
            }
        }
        System.out.print("由大排到小排序結果: ");
        for (int x : data) {
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
