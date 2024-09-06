import java.util.*;

public class arranti{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int r = sc.nextInt();
        System.out.println("Enter the Column size");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] ta = new int[c][r];
        int el = 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = el;
                el++;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ta[j][i] = a[i][j];
            }
        }
        for(int i=c-1;i>=0;i--){
            for(int j=0;j<r;j++){
                System.out.print(ta[i][j]);
            }
            System.out.println();
        }
    }
}