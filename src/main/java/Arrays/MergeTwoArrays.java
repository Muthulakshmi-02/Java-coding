package Arrays;

import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] merged = new int[size1 + size2];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int k = 0;

        for (int i = 0; i < size1; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            merged[k++] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}