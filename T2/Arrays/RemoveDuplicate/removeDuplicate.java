import java.util.*;

class removeDuplicate
{
    public static void main(String[] args){
        int[] arr = {1,3,3,4,3,3,7};
        Arrays.sort(arr);
        int[] s = new int[arr[arr.length-1]+1];
        int counter = 0;
        int dup = 0;

        for(int i=0;i<arr.length;i++){
            if(s[arr[i]] == 0){
                s[arr[i]]++;
                arr[counter] = arr[i];
                counter++;
            }
            else{
                dup++;
            }
        }

        for(int i=0;i<arr.length-dup;i++){
            System.out.print(arr[i]+" ");
        }

    }
}