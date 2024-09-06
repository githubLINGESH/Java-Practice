import java.util.*;
class Tsum{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        int tar = 12;
        int n = arr.length-1;
        int left = 0; int right = n;
        Arrays.sort(arr);
        while(left<right){
            if(arr[left]+arr[right]==tar){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }

            else if(arr[left]+arr[right]>tar){
                right--;
            }
            else{
                left++;
            }
    }
}
}