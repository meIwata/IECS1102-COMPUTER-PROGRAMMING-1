package java_0319;

public class OutOfBound {
    public static void main(String[] args) {
        int[] a = new int[4];

        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;

        for(int i=1; i<=a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]); // java.lang.ArrayIndexOutOfBoundsException
        }
    }
}
