

class FreqOfEle{
    public static void main(String[] args){
        //Scanner s = new Scanner(System.in);

        int n = 6;

        int[] a = {7,5,7,3,5,7};

        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            int c = 1;
            if(dp[i]!=-1){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        dp[j] = -1;
                        c++;
                    }
                    dp[i] = c;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(dp[i]!=-1){
                System.out.print(dp[i]+" ");
            }
        }
        
    }
}