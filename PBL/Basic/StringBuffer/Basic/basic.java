class basic{
    public static void main(String[] args) {
        String a = "Doge";
        String b = "COin";

        System.out.println((a+b).toLowerCase());

        String w = "Wiproo";

        int n = w.length()-1;
        String nw = "";
        for(int i=0;i<n;i++){
            nw += w.charAt(0) + "" + w.charAt(1);
        }

        System.out.println(nw);
        String some = "";
        if((n+1)%2==0){
            nw ="";
            for(int i=0;i<=n/2;i++){
                nw += w.charAt(i);
            }
            System.out.println(nw);
        }
        else{
            System.out.println("Odd size");
        }

        for(int i=1;i<=n-1;i++){
            some += w.charAt(i);
        }
        System.out.println(some);

        some="";
        int r = 3;
        int rm = (n+1)-r;
        for(int i=0;i<r;i++){
            for(int j=rm;j<=n;j++){
                some += w.charAt(j);
            }
        }
        System.out.println(some);

}
}