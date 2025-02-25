package java_0225;

public class ShortCircuit {
    public static void main(String[] args) {
        int i = 3, j = 4;
        System.out.println("使用 | 的運算結果: " + (true | (i++ == j)));
        System.out.println("運算後i的內容:" + i);

        i = 3;
        j = 4;
        System.out.println("使用 || 的運算結果: " + (true || (i++ == j)));
        System.out.println("運算後i的內容:" + i);
    }
}
