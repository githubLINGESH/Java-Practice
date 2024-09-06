import java.util.*;

class subseq{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        String ss = s.nextLine();
        int i = 0 ; int j =0; int c = 0;
        while(i<st.length() && j<ss.length()){
            if(st.charAt(i) == ss.charAt(j)){
                i++;
                j++;
                c = c+1;
            }
            else{
                i++;
            }
        }
        if(c==ss.length()){
            System.out.println("Subsequence");
        }
        else{
            System.out.println("Not a subsequence");
        }


    }
}