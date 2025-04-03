package java_0327;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] a = {20,30,40};
        // System.out.print("陣列a的元素：");
        // for(int i : a){   // 顯示陣列a的所有元素
        //   System.out.print("\t"+i);
        // }
        
        int[] b = a; // 將a的內容指定給b中
        // System.out.print("\n陣列b的元素：");
        // for(int i : b) {  // 顯示陣列b的所有元素
        //   System.out.print("\t"+i);
        // }

        b[2] = 100; // 更改陣列b的內容
        /* 此時a的陣列也會變成{20, 30, 100}，a跟b都參照到同一個地方，當b修改元素，a也會拿到修改後的元素*/

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
