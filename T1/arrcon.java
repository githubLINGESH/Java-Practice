import java.util.*;
public class arrcon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the row size:");
        int r = s.nextInt();
        System.out.println("Enter the column size:");
        int c = s.nextInt();

        int ad[][]=new int[r][c];
        for(int i=0;i<n;i++){
            a[i] = i;
        }
        int h=0;
        if(r*c==a.length){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ad[i][j] = a[h];
                h++;
            }
        }
        }
        else{
            System.out.println("This can't be done");
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ad[i][j]);
            }
            System.out.println();
        }
    }
}

1 5 9
2 6 10
3 7 11
4 8 12
