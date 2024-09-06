import java.util.*;
class zsum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int su = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==n-i-1){
                    su = su + a[i][j];
                }
            }
        }
        System.out.println("Z sum");
        System.out.println(su);
        }
        
    }