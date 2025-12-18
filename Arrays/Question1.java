package Arrays;

import java.util.Scanner;

public class Question1 {
    public static void findDuplicate(int numbers[]) {
    boolean hasDuplicate = false;

    for (int i = 0; i < numbers.length; i++) {
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] == numbers[j]) {
                hasDuplicate = true;
                break;
            }
        }
        if (hasDuplicate) {
            break;
        }
    }

    if (hasDuplicate) {
        System.out.println("\nDuplicate values exist");
    } else {
        System.out.println("\nNo duplicate values");
    }
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print array
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        findDuplicate(numbers);
    }
}
