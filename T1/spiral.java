import java.util.*;
class spiral{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int e = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=e;
                e+=1;
            }
        }
        
        int t=0; int b=n-1; int r=n-1; int l=0;
        while(b>=t && l<=r){
            for(int i=l;i<=r;i++){
                System.out.println(a[t][i]);
            }
            t+=1;
            for(int i=t;i<=b;i++){
                System.out.println(a[i][r]);
            }
            r-=1;
            for(int i=r;i>=l;i--){
                System.out.println(a[b][i]);
            }
            b-=1;
            for(int i=b;i>=t;i--){
                System.out.println(a[i][l]);
            }
            l+=1;
        }

    }
}