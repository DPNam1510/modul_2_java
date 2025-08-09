package ss3Array;

import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Volume index:");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Add index:");
        int x = sc.nextInt();

        System.out.print("Add local index:");
        int index = sc.nextInt();

        if (index < 0 || index > n) {
            System.out.print("Can't add in array");
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            n++;
            System.out.print("New array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
