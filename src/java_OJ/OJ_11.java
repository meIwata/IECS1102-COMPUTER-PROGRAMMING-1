package java_OJ;

import java.util.Scanner;

public class OJ_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt(); 
        int h = sc.nextInt(); 

        int[][] matrix = new int[h + 1][w + 1];


        for (int i = 0; i <= h; i++) { 
            for (int j = 0; j <= w; j++) {
                matrix[i][j] = i + j; 
            }
        }


        for (int[] row : matrix) { // 遍歷每一行
            for (int value : row) { // 遍歷行中的每個元素
                System.out.printf("%5d", value);
            }
            System.out.println();
        }

        sc.close();
    }
}
