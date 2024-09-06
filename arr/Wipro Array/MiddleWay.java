import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Middle way 1: " + Arrays.toString(middleWay(array1, array2)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
