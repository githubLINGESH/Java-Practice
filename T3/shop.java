import java.util.*;

class shop{

    public static int fact(int n){
        if(n==0) return 1;
        return (n * fact(n-1));
    }
    public static void main(String[] args){
        int n = 5, m = 3, p = 5, e = 3;
        Scanner s = new Scanner(System.in);

        // int n = s.nextInt();
        // int m = s.nextInt();
        // int p = s.nextInt();
        // int e = s.nextInt();
        
        //multiply the combinatoons since I want the combinations that pencils can be choosen from total pencil
        //similarly eraser
        int comb = fact(n) / (fact(n-p) * fact(p));
        int comb2 = fact(m) / (fact(m-e) * fact(e));

        System.out.println(comb * comb2);
    }
}