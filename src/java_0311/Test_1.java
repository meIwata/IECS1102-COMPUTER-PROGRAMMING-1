package java_0311;

public class Test_1 {
    public static void main(String[] args) {
        int count = 0;//計算次數
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println("總和: " + sum);
        System.out.println("總共執行: " + count + "次");
    }
}
