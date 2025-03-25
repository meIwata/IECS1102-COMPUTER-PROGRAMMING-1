package java_0325;

public class NonRectangular {
    public static void main(String[] args) {
        int[][] a = new int[3][]; // 有三個陣列，裡面有幾個元素還不知道

        a[0] = new int[2]; // 配置第一個陣列有兩個元素
        a[1] = new int[4]; // 配置第二個陣列有四個元素
        a[2] = new int[3]; // 配置第三個陣列有三個元素

        System.out.println("a裡面有" + a.length + "個陣列");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]裡面有" + a[i].length + "個元素");
        }
    }
}
