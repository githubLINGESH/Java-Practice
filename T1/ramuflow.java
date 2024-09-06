import java.util.*;

public class ramuflow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int r = sc.nextInt();
        System.out.println("Columns:");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int seq = 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = seq;
                seq = seq+1;
            }
        }

        System.out.println("Give number:");
        int gn = sc.nextInt();

        int m = 0 ; int ro=0  ; int b = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==gn){
                    if(i%2!=0 || j%2!=0){
                        if(i==r/2 && r==c){
                            ro = 1;
                        }
                        else{
                            m = 1;
                        }
                    }
                    else{
                        b = 1;
                    }
                }
            }
        }
        if(m==1){
            System.out.println("Mango");
        }
        else if(r==1){
            System.out.println("Rose");
        }
        else{
            System.out.println("Bannana");
        }
    }
}