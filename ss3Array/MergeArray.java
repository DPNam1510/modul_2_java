package ss3Array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Volume index arr1:");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        int[] arr2 = new int[n];
        System.out.println("Volume index arr2:");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            arr2[i] = sc.nextInt();
        }
        System.out.println();
        int[] arr3 = new int[n + n];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            arr3[n + i] = arr2[i];
        }
        System.out.println("New arr3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
