package java_0225;

public class Mod {
    public static void main(String[] args) {
        int apple = 100, people = 7, q, r;
        q = apple / people; // 取商數
        r = apple % people; // 取餘數

        System.out.println(people + "人分" + apple + "個蘋果,");
        System.out.println("每個人分" + q + "個, 還剩" + r + "個");
    }
}
