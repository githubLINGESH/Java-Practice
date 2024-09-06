import java.util.*;
public class Main {

    public static boolean is_pal(String str){
        int j= str.length();
        for(int i=0;i<j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String str="aaabaaa"; //aabbdad aa bb dad
       
        int j=0;
        String substr=" ";
        for(int i=0;i<str.length();i++){
            String f = str.substring(0,i+1);

            if(is_pal(f)){
                for(int j=i+1;j<str.length();j++){
                    String s = str.substring(i+1,j+1);
                    String t = str.substring(j+1,str.length());

                    if(is_pal(s) && is_pal(t)){
                        break;
                    }
                }
            }
            
        }

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);

        
    }
}
