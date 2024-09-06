class anagram{
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        int[] a = new int[26];
        int f = 0;
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
            f = 1;
        }

        for(int i=0;i<s1.length();i++){
                a[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            if(a[s2.charAt(i)-'a'] == 0){
                System.out.println("Not anagram");
                f = 1;
                break;
            }
        }
        if(f ==0 ){
            System.out.println("Anagram");
        }
    }
}