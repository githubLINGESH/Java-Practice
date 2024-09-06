import java.util.*;

public class climbs {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int fnl = s.nextInt();
    int step = s.nextInt();
    int init = s.nextInt();

    int[] dp = new int[fnl+1];
    dp[init] = 1;
    for(int i=init+1;i<dp.length;i++){
        for(int j=1;j<=step;j++){
            if(i-j>=0){
                dp[i] += dp[i-j];
            }
        }
    }

    System.out.println(dp[fnl]);
    
    }
}
