package DSSearchAlogorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int position = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the value to be found");
        int val = sc.nextInt();
        int arr[] = new int[n];
        //int i = 1;
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                position = i + 1;
                break;
            } else {
                position = -1;
            }
        }
        if (position != -1) {
            System.out.println(val + " is found at position " + position);

        } else {
            System.out.println(val + " is not present in the list");

        }

    }
}
