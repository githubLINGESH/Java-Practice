import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        int[] array1 = {1, 10, 10, 2};
        System.out.println("Array 1: " + Arrays.toString(withoutTen(array1)));
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        return result;
    }
}
