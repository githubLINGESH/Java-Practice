public class Only14 {
    public static void main(String[] args) {
        int[] array = {1, 4, 1, 4};
        System.out.println("Array : " + only14(array));
    }

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
