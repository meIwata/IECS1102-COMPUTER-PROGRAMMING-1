package java_0327;

public class ArrayAssignment_clone {
    public static void main(String[] args) {
        int[] a = {20,30,40};
        // System.out.print("陣列a的元素：");
        // for(int i : a){   // 顯示陣列a的所有元素
        //   System.out.print("\t"+i);
        // }
        
        int[] b = a.clone(); // 將a的內容複製給b中
        // System.out.print("\n陣列b的元素：");
        // for(int i : b) {  // 顯示陣列b的所有元素
        //   System.out.print("\t"+i);
        // }

        b[2] = 100; // 更改陣列b的內容
        /* 因為b拿到的是副本，自由更改都不會影響到a*/

        System.out.print("陣列a的元素：");
        for(int i : a){   // 顯示陣列a的所有元素
          System.out.print("\t"+i);
        }
        System.out.print("\n陣列b的元素：");
        for(int i : b) {  // 顯示陣列b的所有元素
          System.out.print("\t"+i);
        }

    }
}
