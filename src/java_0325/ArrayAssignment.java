package java_0325;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] a = { 20, 30, 40 };
        int[] b = a;

        b[2] = 100;
        System.out.print("印出陣列 a 的內容: ");
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
        for(int i:a){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        System.out.print("印出陣列 b 的內容: ");
        // for (int i = 0; i < b.length; i++) {
        //     System.out.print(b[i] + " ");
        // }

        for(int i:b){
            System.out.print(i + " ");
        }
    }
}
