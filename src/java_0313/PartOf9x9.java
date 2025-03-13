package java_0313;

public class PartOf9x9 {
    public static void main(String[] args) {
        for(int x=1; x<=9; x++){
            for(int y = 1; y<=9; y++){
                if(x*y>25){
                    break;
                }
                System.out.println(x+"*"+y);
            }
            
        }
    }
}
