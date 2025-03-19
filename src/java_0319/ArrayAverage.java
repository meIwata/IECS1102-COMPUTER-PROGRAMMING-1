package java_0319;

public class ArrayAverage {
    public static void main(String[] args) {
        double[] students;
        students = new double[5];
        students[0] = 70;
        students[1] = 65;
        students[2] = 90;
        students[3] = 85;
        students[4] = 95;
        double sum = 0;
        for (int i = 0; i < students.length; i++) { // 取得陣列長度
            sum += students[i]; // 把每一個i的值加總
        }
        double average = sum / students.length; // 平均值
        System.out.println("平均分數是: " + average);
    }
}
