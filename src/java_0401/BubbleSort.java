package java_0401;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = { 23, 54, 33, 5, 7, 46, 99, 35 };
        int temp;

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; i < data.length - 1; i++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            for (int k : data) {
                System.out.println("" + k);
            }
        }
    }
}
