package java_0220;

public class Floating {
    public static void main(String[] args) {
        //float f1 = 0.01; //報錯，java: incompatible types: possible lossy conversion from double to float
        float f1 = 0.01f; //須要加上f，要不然會把你當成double
        System.out.println(f1);
    }
}