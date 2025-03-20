package java_0319;

public class ArrayLoop2 {
    public static void main(String[] args) {
        double[] students = { 70, 65, 90, 85, 95 };
        double sum = 0;

        // 傳統for迴圈，利用陣列的長度來控制迴圈
        for (int i = 0; i < students.length; i++) {
            double score = students[i];
            sum += score; // 累積加總
        }

        System.out.println("總分: " + sum);
        
        double avg = sum / students.length; // 平均值
        System.out.println("平均: " + avg);

        System.out.println("--------------------");
        //要取出陣列最後一個數值
        //students[最後一個數值]，索引是length-1
        System.out.println("陣列最後一個數值: " + students[students.length-1]);
    }
}
