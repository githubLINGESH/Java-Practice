import java.util.*;
public class zombies {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] z = {4,4,5,1,3};
        int b = 1;

        for(int i=0;i<z.length;i++){

            if (b<0)
            {
                System.out.println("No" + b);
                return;
            }
            b = b - ((z[i] % 2) + (z[i]/2));
        }

        if(b>0){
            System.out.println("Yes"+" "+ b);
        }
        else System.out.println("No" + b);
    }
}
