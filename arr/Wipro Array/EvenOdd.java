import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 1, 0, 1, 1};
        System.out.println("Array 1: " + Arrays.toString(evenOdd(array1)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
