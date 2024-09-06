import java.util.*;

class subseq{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == 'G'){
                for(int j=0;j<i;j++){
                    System.out.print(st.charAt(j));
                }
            }
            else if(st.charAt(i) =='E' && st.charAt(i+1)!='F'){
                for(int j=0;j<i+1;j++){
                    System.out.print(st.charAt(j));
                }
            }
            else if(st.charAt(i)=='E' && st.charAt(i+1)=='F'){
                for(int j=0;j<i;j++){
                    System.out.print(st.charAt(j));
                }
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