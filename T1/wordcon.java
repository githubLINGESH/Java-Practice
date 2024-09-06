import java.util.*;

public class wordcon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word1:");
        String w1= s.nextLine();
        System.out.println("Enter the word2:");
        String w2= s.nextLine();
        int c = 1;
        if(c==1){
        System.out.println(w1);
        c = 0;
        }
        while(w1.charAt(w1.length()-1)==w2.charAt(0)){
            System.out.println(w2);
            w1 = w2;
            System.out.println("Enter the next word:");
            String nw = s.nextLine();
            w2 = nw;
        }
    }
}