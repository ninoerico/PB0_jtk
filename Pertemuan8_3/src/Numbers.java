import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort?");
        int n = scan.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        Sorting.selectionSort(numbers);
        System.out.println("Sorted numbers:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
