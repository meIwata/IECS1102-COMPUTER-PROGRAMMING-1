package java_0227;

public class Promotion {
    public static void main(String[] args) {
        byte i = -2;
        i = (byte) (i>>1); //前面要加上(byte)強制轉型
        System.out.println(i); // -1
    }
}
