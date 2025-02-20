package java_0220;

public class EscapeValue {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("a=\\" + a);
        System.out.println("a=\b" + a);
        System.out.println("a=\t" + a);
        System.out.println("a=\n" + a);
        System.out.println("a=\f" + a);
        System.out.println("a=\r" + a);
        System.out.println("a=\"" + a);
        System.out.println("a=\'" + a);
        System.out.println("a=\\" + a);
    }
}