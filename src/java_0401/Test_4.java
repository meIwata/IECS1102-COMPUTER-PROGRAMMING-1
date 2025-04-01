package java_0401;

public class Test_4 {
    public static void main(String[] args) {
        int [] a = {30, 20, 10, 5,34};
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        
        int [] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
    
}
