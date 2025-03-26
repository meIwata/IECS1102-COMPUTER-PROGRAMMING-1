package java_0325;

public class StoreBox {
    public static void main(String[] args) {
        int[] boxes = new int[20];

        // 標記已使用的盒子
        boxes[1] = 1;
        boxes[2] = 1;
        boxes[4] = 1;
        boxes[7] = 1;
        boxes[11] = 1;
        boxes[12] = 1;
        boxes[15] = 1;
        boxes[19] = 1;

        int usedCount = 0;
        int unusedCount = 0;
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == 0) {
                unusedCount++;
            } else {
                usedCount++;
            }
        }
        System.out.println("使用的盒子數量: " + usedCount);
        System.out.println("未使用的盒子數量: " + unusedCount);

    }
}
