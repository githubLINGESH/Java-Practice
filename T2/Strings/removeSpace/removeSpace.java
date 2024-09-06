import java.util.*;

class removeSpace{
    public static void main(String[] args){
        String s = "wi nn er";

        String s1 = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1 += s.charAt(i);
            }
        }

        System.out.println(s1);
    }
}