import java.util.*;

public class arrtr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the ele:");
                int el = sc.nextInt();
                a[i][j] = el;
            }
        }

        System.out.println(a);
    }

}