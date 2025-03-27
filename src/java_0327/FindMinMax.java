package java_0327;

public class FindMinMax {
    public static void main(String[] args) {
        int[] temp = { 21, 18, 21, 23, 25, 25, 24, 22, 22, 16 }; // 溫度
        int min = temp[0]; // 先將陣列任一元素假設為最低溫，temp[0]=21
        int max = temp[0]; // 先將陣列任一元素假設為最高溫

        for (int i : temp) {
            if (i < min) { // 比temp[0]=21
                min = i; // 就更新最低溫度
            }
            if (i > max) { // 比temp[0]=21
                max = i; // 更新最高溫度
            }
        }

        System.out.println("全台目前最低的溫度是：" + min + "度");
        System.out.println("全台目前最高的溫度是：" + max + "度");
    }
}
