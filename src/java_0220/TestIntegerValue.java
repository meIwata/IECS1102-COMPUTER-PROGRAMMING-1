package java_0220;

public class TestIntegerValue {
    public static void main(String[] args) {
        System.out.println("10進位 1357=" + 1357); //10進位 1357=1357

        int i = 0b10011001;
        System.out.println("2進位 0b10011001=" + i); //2進位 0b10011001=153

        long l = 0XADEF;
        System.out.println("16進位 0XADEF=" + l); //16進位 0XADEF=44527

        short s = 10357;
        System.out.println("8進位 10357=" + s); //8進位 10357=10357

    }
}