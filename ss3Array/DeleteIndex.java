package ss3Array;

import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Volume index:");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int X = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == X) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = 0;
            }
        }
        System.out.print("New array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
