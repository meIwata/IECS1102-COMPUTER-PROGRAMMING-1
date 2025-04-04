package java_OJ;

import java.util.Scanner;

public class OJ_04 {
    // 最大值與最小值
    /*
     * 寫一個程式用 for 迴圈來找出輸入的十個數字的最大值和最小值，數值不限定為整數，且值可存放於 float 型態數值內。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] nums = new float[10]; //陣列裡可以放10個元素
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextFloat(); // 把每一個輸入的數值放到陣列裡面
        }

        // 由小排到大
        for (int x = 0; x < nums.length-1; x++) {
            for (int y = 0; y < nums.length - 1 - x; y++) {
                if (nums[y] > nums[y + 1]) {
                    float temp;
                    temp = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = temp;
                }
            }
        }
        // for (float num : nums) {
        //     System.out.println(num);
        // }
        System.out.printf("max: %.2f%n" , nums[nums.length - 1]);
        System.out.printf("min: %.2f%n" , nums[0]);
        sc.close();
    }
}
