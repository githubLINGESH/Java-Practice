import java.util.*;

class permut{
    void permut(String s,int l,int r){
        if(l==r){
            System.out.println(s);
        }

        else{
            for(int i=l;i<=r;i++){
                s = swap(s,l,i);
                permut(s,l+1,r);
                //System.out.println(l+1 + " " + r); //using l+1 t get the next comb.
                s = swap(s,l,i);
            }
        }
    }

    String swap(String s,int l,int r){
        char[] a = s.toCharArray();
        char temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        return String.valueOf(a);
    }
}
class permutate{
    public static void main(String[] args){
        String s = "ABC";

        permut p = new permut();
        p.permut(s,0,s.length()-1);
    }
}