package java_0227;

public class BitwiseComplement {
    public static void main(String[] argv) {
      byte i = 127; // =>01111111
                    // ~011111111 => 10000000 => -128
      System.out.println("~127：" + (~i));
  
      i = -1;  // => 11111111
               //  ~11111111 => 00000000 => 0
      System.out.println("~(-1)：" + (~(-1)));
    }
  }
  
