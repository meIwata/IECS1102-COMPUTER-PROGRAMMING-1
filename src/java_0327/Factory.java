package java_0327;

public class Factory {
    public static void main(String[] args) {
        double fact = 1;
        int i = 5;
        if (args.length > 0) {
            i=Integer.parseInt(args[0]);
        }
        System.out.print(i+"!=");
        for(;i>0;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
