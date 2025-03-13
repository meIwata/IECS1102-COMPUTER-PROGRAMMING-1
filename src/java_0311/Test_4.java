package java_0311;

public class Test_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i=1; ; i++) {
            sum = sum + i;
            System.out.println("總和: " + sum);
        }
        // 印在外面會報錯，因為她是永遠到不了的碼。
        // System.out.println("總和: " + sum);
        
        
    }
}
