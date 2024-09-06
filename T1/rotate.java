import java.util.*;
class rotate{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the ele");
                a[i][j] = s.nextInt();
            }
        }
        for(int k=0;k<n;k++){
            for(int m=0;k>m;m++){
                int t = a[k][m];
                a[k][m] = a[m][k];
                a[m][k] = t;
            }
        }
        

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int te = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = te;
            }
        }

        System.out.println("90");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}

1 5 9
2 6 10
3 7 11
4 8 12
