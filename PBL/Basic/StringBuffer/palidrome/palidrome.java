import java.util.*;

class palidrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String srev = "";
        
        for(int i=0;i<str.length();i++){
            srev = str.charAt(i) + srev;
        }

        System.out.println((srev.equals(str)) ? "Palidrome" : "Not a palidrome");

        System.out.println("using String Buffer");

        StringBuffer sf = new StringBuffer(str);

        System.out.println(((sf.reverse().toString()).equals(str)) ? "Palidrome" : "Not");
    }
}