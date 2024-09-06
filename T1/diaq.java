//One Loop
import java.util.*;
class diaq{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int d = 0;
        int rd = 0;
        for(int i=0;i<n;i++){
            d = d+a[i][i];
            rd = rd+a[i][n-i-1];
        }
        if(d == rd){
            System.out.println(d);
            System.out.println(rd);
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
            System.out.println(d);
            System.out.println(rd);
        }

    }
}


//2 loops approach
import java.util.*;
class diaq{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int d = 0;
        int rd = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i==j){
                d = d+a[i][i];
            }
            if(j==n-i-1)
                rd = rd+a[i][n-i-1];
            }
        }
        if(d == rd){
            System.out.println(d);
            System.out.println(rd);
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
            System.out.println(d);
            System.out.println(rd);
        }

    }
}

