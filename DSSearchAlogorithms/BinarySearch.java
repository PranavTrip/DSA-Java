package DSSearchAlogorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int beginning = 0, end = (n - 1), position = -1;
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to be found");
        int val = scanner.nextInt();

        // Binary Search Logic
        while (beginning <= end) {
            int mid = (beginning + end) / 2;
            if (arr[mid] == val) {
                position = mid + 1;
                break;
            } else if (arr[mid] > val) {
                end = mid - 1;
            } else {
                beginning = mid + 1;
            }
        }

        if (position == -1) {
            System.out.println(val + " is not present in the list");
        } else {
            System.out.println(val + " is present at position " + position);
        }
    }
}
