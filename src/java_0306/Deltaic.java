package java_0306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deltaic {

    public static void main(String[] argv)
            throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i, j, k;

        // 輸入第 1 邊邊長
        System.out.println("請輸入三角形的三邊長：");
        System.out.print("邊長 1 →");
        String str = br.readLine();
        i = Integer.parseInt(str);

        // 輸入第 2 邊邊長
        System.out.print("邊長 2 →");
        str = br.readLine();
        j = Integer.parseInt(str);

        // 輸入第 3 邊邊長
        System.out.print("邊長 3 →");
        str = br.readLine();
        k = Integer.parseInt(str);

        if (((i + j) > k) && ((i + k) > j) && ((j + k) > i))
            System.out.println("可以為三角形的三邊長");
        else
            System.out.println("三邊長不能構成三角形");
    }
}