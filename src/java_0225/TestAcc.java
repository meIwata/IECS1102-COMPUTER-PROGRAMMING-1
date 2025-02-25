package java_0225;

public class TestAcc {
    public static void main(String[] args) {
        int i = 0, j, k;
        j = i++ * 8;
        k = ++i * 8;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}
