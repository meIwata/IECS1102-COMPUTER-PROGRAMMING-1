package java_0225;

public class PostInc {
    public static void main(String[] args) {
        int i = 0, j;
        j = (i++) * 10; // i++為後置遞增
        System.out.println("變數i的內容是:" + i);
        System.out.println("變數j的內容是:" + j);

        i = 0;
        j = (++i) * 10; // ++i為前置遞增
        System.out.println("變數i的內容是:" + i);
        System.out.println("變數j的內容是:" + j);
    }
}
