package java_0220;

public class StringVariable {
    public static void main(String[] args) {
        String s1 = "第一個字串";
        String s2 = "第二個\t字串";

        System.out.println(s1); //第一個字串
        System.out.println(s2); //第二個	字串

        System.out.println(s1 + '\n' + s2);
        /*
        第一個字串
        第二個	字串
        */
    }
}