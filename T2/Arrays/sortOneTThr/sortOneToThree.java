class sortOneToThree{
    public static void main(String[] args){
        int[] a = {0,1,0,1,0,2,2,1};
        int n = a.length-1;
        int l = 0;
        int m = 0;
        int h = n-1;

        while(m<=h){
            if(a[m]<1){
                int t = a[m];
                a[m] = a[l];
                a[l] = t;

                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int t = a[m];
                a[m] = a[h];
                a[h] = t;
                h--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}