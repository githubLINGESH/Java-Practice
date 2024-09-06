import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 34, 56, 7};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to search:");
        int searchElement = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        scanner.close();
    }
}
