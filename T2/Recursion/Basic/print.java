import java.util.*;

class some{
    int printer(int c,int n){
        System.out.print(c+" ");
        if(c==n){
            return c;
        }
        return printer(c+1,n);
    }
}
class print{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        some so = new some();
        so.printer(1,n);
        
    }
}