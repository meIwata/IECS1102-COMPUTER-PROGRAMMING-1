package java_0325;

public class NewArray {
    public static void main(String[] args) {
        int[] a = { 20, 30, 40 };
        System.out.print("陣列a: ");

        // 增強型 for迴圈，遍歷每一個元素
        for (int i : a) {
            System.out.print("\t" + i); // \t 是跳位（tab）字元，會在輸出結果中插入一個縮排空間
        }

        a = new int[5]; // 重新配置a 裡面有5個元素
        a[0] = 100;
        a[1] = 200;

        System.out.print("\n重新配置陣列a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]); // a[i]為a陣列每一個元素裡面的值
        }
        // for(int i:a){
        //     System.out.print("\t" +i);
        // }
    }
}
