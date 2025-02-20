package java_0220;

public class NameConsant {
    public static void main(String[] args) {
        double r = 3.0;
        final double PI = 3.1416; //final 為常數，不可更改
        System.out.printf("圓周: %.2f\n", 2 * PI * r);
        System.out.println("面積: " + PI*r*r);
    }
}
