class pattern{
    public static void main(String[] args){
        int n = 5;
        int counter = 1;
        int printer = 1;
        for(int i=0;i<n;i++){
                for(int l=0;l<i;l++){
                    System.out.print(" ");
                }

                for(int p=1;p<printer+1;p++){
                    if(p == (printer)/2 - 1){
                        System.out.print(counter);
                        counter++;
                    }
                    else{
                        System.out.print(p);
                    }
                }
                printer = printer + 1;

                for(int k=0;k<i;k++){
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
}