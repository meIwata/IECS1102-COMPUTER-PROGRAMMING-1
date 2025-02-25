package java_0225;
public class Parens {
    public static void main(String[] args) {
        
        int i = 1 + 3 * 5 + 7; // 先算乘除，再算加减
        System.out.println("1 + 3 *5 + 7 = " + i);

        i = (int) (1 + Math.pow(3, 2) * 5 + 7); // 需要轉型，使用Math.pow()函數來做次方運算
        System.out.println("1 + (3^2) * 5 + 7 = " + i);

        i = (1 + 3) * 5 + 7; // 先算括号里的，再算乘除，再算加减
        System.out.println("(1 + 3) * 5 + 7 = " + i);

        i = 1 + 3 * (5 + 7); // 先算括号里的，再算乘除，再算加减
        System.out.println("1+3*(5+7) = " + i);
    }
}