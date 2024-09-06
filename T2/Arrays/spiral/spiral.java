import java.io.*;
import java.util.*;

public class spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int num = 1;
        
        int[][] matrix = new int [n][n];

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] < 10){
                    System.out.print("0");
                    
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}