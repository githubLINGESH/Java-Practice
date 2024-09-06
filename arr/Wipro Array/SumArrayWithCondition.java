public class SumArrayWithCondition {
    public static void main(String[] args) {
        int[] array1 = {10, 3, 6, 1, 2, 7, 9};


        System.out.println("Sum of array1: " + calculateSum(array1));
       
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        boolean ignore = false;

        for (int num : numbers) {
            if (num == 6) {
                ignore = true;
            } else if (num == 7 && ignore) {
                ignore = false;
            } else if (!ignore) {
                sum += num;
            }
        }

        return sum;
    }
}
