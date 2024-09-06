import java.util.*;

class some{
    int fact(int f){
        if(f<=1){
            return 1;
        }
        return f * fact(f-1);
    }
}
class factorial{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int f = s.nextInt();

        some so = new some();

        System.out.println(so.fact(f));
    }
}