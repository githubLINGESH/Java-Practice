class binaryToDec{
    public static void main(String[] args) {
        String n = "1010";

        int dec = 0;
        int pow = n.length() - 1;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                dec += Math.pow(2,pow);
            }
            pow--;
        }

        System.out.print(dec);
    }
}