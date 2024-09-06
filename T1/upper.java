/*import java.util.*;
class upper{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int c = 0;
        for(int k=0;k<n;k++){
            for(int m=0;k>m;m++){
                if(a[k][m]!=0){
                    c+= 1;
                }
            }
        }
        if(c>=1){
            System.out.println("NOt Upper Triangular");
        }
        else{
            System.out.println("Upper Triangular");
        }
    }

}*/


import java.util.*;
class upper{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int c = 0;
        for(int k=0;k<n;k++){
            for(int m=0;m<n;m++){
                if(a[k][m]!=0 && k<m){
                    c+= 1;
                }
            }
        }
        if(c==0){
            System.out.println("lower Triangular");
        }
        else{
            System.out.println("NOt a lower Triangular");
        }
    }

}










