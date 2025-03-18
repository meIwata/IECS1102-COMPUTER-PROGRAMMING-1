package java_0318;

public class Test_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int x = 7; x > i; x -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i -= 2) {
            for (int a = 7; a > i; a -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
