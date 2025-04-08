package java_OJ;

import java.util.Scanner;

public class OJ_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int bottle = sc.nextInt(); 
            if (bottle <= 0 || bottle > 200) {
                break;
            }
            int count = bottle; 
            int empty = bottle; 
            while (empty >= 3) {
                int newBottle = empty / 3; 
                count += newBottle; 
                empty = empty % 3 + newBottle;
            }

            if(empty ==2){
                count++;
            }
            System.out.println(count);
        }

        sc.close();
    }
}