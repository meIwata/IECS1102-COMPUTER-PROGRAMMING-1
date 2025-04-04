package java_OJ;

import java.util.Scanner;

// 用陣列找到出現最多次的數字
/*
 * 寫一個java 語言程式，使用者輸入10個，0-9的數字，需要找出輸入中出現次數最多的數字，並顯示該數字及其出現的次數。
 * 請使用者輸入10個整數。
 * 數字範圍0~9,
 * 當使用者輸入超過10個整數時顯示"Out of range"
 */
public class OJ_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int[] count = new int[10]; // 計算每個數字出現的次數
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt(); // 把每一個輸入放到nums陣列裡
            if (nums[i] < 0 || nums[i] > 9) {
                System.out.println("Out of range");

                return;
            }
            count[nums[i]]++; // 計算數字出現次數
        }
        int maxNum = 0, maxCount = 0;
        for (int j = 0; j < count.length; j++) {
            if (count[j] > maxCount) {
                maxCount = count[j];
                maxNum = j;
            }
        }
        System.out.println(maxNum + "," + maxCount);

    }
}
