package java_0313;

public class PartOf9x9 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                if (x * y > 25) {
                    break;
                }
                System.out.print(x + "*" + y + "=" + x * y + "\t");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

        outloop: for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a * b > 25) {
                    System.out.println();
                    continue outloop; //內迴圈跳出，執行外迴圈
                }
                System.out.print(a + "*" + b + "=" + a * b + "\t");
            }
            System.out.println();
        }
    }
}
