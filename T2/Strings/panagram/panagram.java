class panagram{
    public static void main(String[] args){
        String str="the quick brown fox jumps over the lazy dog";
        boolean[] a = new boolean[26];
        str.toLowerCase();
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            a[str.charAt(i)-'a'] = true;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]==false){
                System.out.println("Not a panagram");
                break;
            }
        }
    }
}