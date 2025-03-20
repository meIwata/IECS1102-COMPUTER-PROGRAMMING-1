package java_0319;

public class ArrayWithExpr {
    public static void main(String[] args) {
        int i = 4, j = 8;
        int[] a = new int[i];
        int[] b = new int[j - i]; //int[] b = new int[4];

        System.out.println("a的長度: " + a.length);
        System.out.println("b的長度: " + b.length);
    }
}
