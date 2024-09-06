import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 20, 40};

        Arrays.sort(numbers);

        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
}
