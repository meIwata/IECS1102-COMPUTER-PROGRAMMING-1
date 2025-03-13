package java_0311;

public class Test_5 {
    public static void main(String[] args) {
        int sum = 0;
        int i=4;
        for (;i==5 ; i++) { // i必須強制==5才會跑，查看4-13比較運算符
            sum = sum + i;
            System.out.println("總和: " + sum);
        }
        
    }
}
