package java_0403;

public class test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // 只是複製參照，兩者指向同一個陣列

        for(int a: arr1){
            System.out.println(a);
        }
        System.out.println("------------------------");
        for(int b: arr2){
            System.out.println(b);
        }

        arr2[0] = 99; // 修改 arr2 的第一個元素
        System.out.println(arr1[0]); // 輸出 99，因為 arr1 和 arr2 指向同一個陣列
    }
}
