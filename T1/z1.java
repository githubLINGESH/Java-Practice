import java.util.*;

class z1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.print("Enter the number of array elements:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int el = sc.nextInt();
            a.add(el);
        }
        int pr = 0;
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(a.get(k)>a.get(j)){
                    if(a.get(k)-a.get(j)>pr){
                        pr = a.get(k)-a.get(j);
                    }
                }
            }
        }
        if(pr>0){
            System.out.print("profit:");
            System.out.println(pr);
        }
        else{
            System.out.println("-1");
        }
}
}
