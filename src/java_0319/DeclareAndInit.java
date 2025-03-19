package java_0319;

public class DeclareAndInit {
    public static void main(String[] args) {
        double[] students = { 70, 65, 90, 85, 95 };
        double sum = 0;
        System.out.println("陣列裡面有幾個元素: " + students.length); // 看陣列裡面有幾個元素
        for (int i = 0; i < students.length; i++) {
            sum = sum + students[i];
        }

        double avg = sum / students.length;
        System.out.println("平均分數: " + avg);
    }
}
