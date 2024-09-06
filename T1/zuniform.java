/*import java.util.*;
class zuniform{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }

        int o = 0;
        int e = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2==0){
                    e = e+1;
                }
                else{
                    o = o+1;
                }
            }
        }
        
        if(o == n*n || e==n*n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
*/

//Flag Approach

import java.util.*;
class zuniform{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }

        int of = 0;
        int ef = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2==0){
                    ef = 1;
                }
                if(a[i][j]%2!=0){
                    of = 1;
                }
            }
        }

        if(ef!=of){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}