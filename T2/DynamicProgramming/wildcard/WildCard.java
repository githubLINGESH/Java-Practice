
class WildCard{
    static boolean checkPattern(String p, String s){
        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        
        dp[0][0] = true;

        for(int j=1;j<=p.length();j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=p.length();j++){
                {
                        if(p.charAt(j-1)==s.charAt(i-1) || p.charAt(j-1)=='?'){
                                dp[i][j] = dp[i-1][j-1];
                        }
                        else if(p.charAt(j-1)=='*'){
                                dp[i][j] = dp[i-1][j] || dp[i][j-1];
                        }
                }
            }
        }

        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        String p = "*c";
        String s = "abc";

        if(checkPattern(p,s)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}