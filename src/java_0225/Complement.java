package java_0225;

public class Complement {
    public static void main(String[] args) {
        boolean lightIsOn = false;
        // boolean lightIsOn = 0; // 不能使用 0 或 1 來表示布林值

        System.out.println("現在有開燈嗎? "+ lightIsOn);

        lightIsOn = !!!lightIsOn;
        System.out.println("現在有開燈嗎? "+ lightIsOn);
    }
}
