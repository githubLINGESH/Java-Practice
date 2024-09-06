import java.util.*;

class stringrev{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String st = s.nextLine();
        int in = 0;
        int space = 1;
        for(int i=0;i<st.length();i++){
            boolean check = Character.isWhitespace(st.charAt(i));
            if(check==true){
                for(int j=i-1;j>=in;j--){
                    System.out.print(st.charAt(j));
                }
                in = i;
                if(space==1){
                    System.out.print(" ");
                    space = 0;
                }
            }

            if(i==st.length()-1){
                for(int j=st.length()-1;j>in;j--){
                    System.out.print(st.charAt(j));
                }
            }
        }
        System.out.println();
    }
}