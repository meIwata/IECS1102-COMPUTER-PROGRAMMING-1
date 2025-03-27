package java_0327;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] a = { 20, 30, 40 };
        int[] b;
        b = a;
        System.out.print("b的陣列有: ");
        for (int i : b) {
            System.out.print("\t" + i);
        }

        System.out.println();
        System.out.println("-------------------------------");

        a = new int[] { 10, 20, 30 };
        a = null;
        System.out.print("b的陣列有: ");
        for (int i : b) {
            System.out.print("\t" + i);
        }
        
        System.out.println();
        System.out.println("-------------------------------");

        b = new int[] { 100, 200 };

        a=b;

        System.out.print("a的陣列有: ");
        for (int i : a) {
            System.out.print("\t" + i);
        }
    }
}
