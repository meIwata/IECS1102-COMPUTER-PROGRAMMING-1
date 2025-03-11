package java_0311;

public class Count9x9 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.printf("%d * %d = %d%n", x, y, x * y);

                // System.out.print(x + " * " + y + " = " + x * y + "\t");
                // System.out.println(x + " * " + y + " = " + x * y);
            }
            // System.out.println();
        }
    }
}
