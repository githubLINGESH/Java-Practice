class subStringreplace{
    public static void main(String[] args){
        String str = "hello World";
        String replaceIn = "hello";
        String replace_with = "hell";

        String s1 = "";

        int Index = str.indexOf(replaceIn);

        int replaceLength = Index + replaceIn.length();
        for(int i=0;i<str.length();i++){
            if(i==Index){
                for(int j=0;j<replace_with.length();j++){
                    s1 += replace_with.charAt(j);
                }
                i = i + replaceIn.length()-1;
            }
            else{
                s1 += str.charAt(i);
            }
        }

        System.out.println(s1);
    }
}