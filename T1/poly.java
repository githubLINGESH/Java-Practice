import java.util.*;
class poly{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String re = "";
        int space_i = st.length();
        for(int i=st.length()-1;i>=0;i--){
            boolean check = Character.isWhitespace(st.charAt(i));
            if(check == true){
                for(int j=i+1;j<space_i;j++)
                    System.out.print(st.charAt(j));
                System.out.print(" ");
                space_i = i;
            }
            if(st.charAt(0)==st.charAt(i)){
                for(int j=i;j<space_i;j++)
                    System.out.print(st.charAt(j));
            }
        }

        /*if(st == re){
            System.out.println("paal");
        }
        else{
            System.out.println("No");
        }*/
    }
}