package java_0225;

public class Logical {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("a= " + a +", b = " +b);
        System.out.println("a & b = " + (a & b));
        System.out.println("a && b = " + (a && b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a || b = " + (a || b));
        System.out.println("a ^ b = " + (a ^ b)); //xor 是不同才為true
    }
}