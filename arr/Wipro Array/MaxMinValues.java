public class MaxMinValues {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
