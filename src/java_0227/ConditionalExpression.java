package java_0227;

public class ConditionalExpression {
    public static void main(String[] args) {
        int i, j = 17;
        i = (j % 2 == 1) ? 2 : j++;
        System.out.println("變數j現在的內容" + i);
        System.out.println("變數j現在的內容" + j);
    }
}