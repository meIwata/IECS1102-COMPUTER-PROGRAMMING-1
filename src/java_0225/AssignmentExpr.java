package java_0225;

public class AssignmentExpr {
    public static void main(String[] args) {
        int i, j;
        i = (j = 6) + 4; // 不太建議這樣寫
        System.out.println("變數i的內容: " + i);
        System.out.println("變數j的內容: " + j);
    }
}